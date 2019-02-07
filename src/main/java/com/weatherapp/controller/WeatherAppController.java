package com.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weatherapp.customexception.WeatherException;
import com.weatherapp.service.WeatherAppServiceImpl;


@Controller
public class WeatherAppController {
	
	@Autowired
	public WeatherAppServiceImpl weatherAppServiceImpl;
	
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String navigateWeatherInfoPage(ModelMap model) throws WeatherException{
		model.put("weatherData",weatherAppServiceImpl.fetchweatherInfo());
		return "weatherInfo";
	}
	 
}
