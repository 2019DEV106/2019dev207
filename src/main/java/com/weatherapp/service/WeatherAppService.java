package com.weatherapp.service;

import com.weatherapp.customexception.WeatherException;
import com.weatherapp.model.WeatherData;

public interface WeatherAppService {
	public final String BRUSSELS_WHEATHER="https://openweathermap.org/data/2.5/weather/?appid=b6907d289e10d714a6e88b30761fae22&lat=50.8503&lon=4.3517";
	public  WeatherData fetchweatherInfo() throws WeatherException ;
	
}

