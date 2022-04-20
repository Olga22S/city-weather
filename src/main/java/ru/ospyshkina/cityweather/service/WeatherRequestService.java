package ru.ospyshkina.cityweather.service;

import java.time.LocalDateTime;

public interface WeatherRequestService {

    void saveWeatherRequest(LocalDateTime date, String param, String result);

}
