package com.weatherapp.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.weatherapp.model.WeatherData;
import com.weatherapp.service.WeatherAppServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(WeatherAppController.class)
public class WeatherAppControllerTest {
	   
	@MockBean
	public WeatherAppServiceImpl weatherAppServiceImpl;
	   
	 
	@InjectMocks
	private WeatherAppController weatherAppController;
	
	@Autowired
	MockMvc mockMvc;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(weatherAppController);
	}
	@Test
	public void testWeatherService() throws Exception{
		when(weatherAppServiceImpl.fetchweatherInfo()).thenReturn(new WeatherData());
		mockMvc.perform(get("/home")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
	 
	 
}
