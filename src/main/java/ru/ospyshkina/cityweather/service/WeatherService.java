package ru.ospyshkina.cityweather.service;

import ru.ospyshkina.cityweather.model.Weather;

public interface WeatherService {

    Weather getWeather(String city);
}
