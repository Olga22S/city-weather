package ru.ospyshkina.cityweather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ospyshkina.cityweather.model.Weather;
import ru.ospyshkina.cityweather.service.WeatherRequestService;
import ru.ospyshkina.cityweather.service.WeatherService;

import java.time.LocalDateTime;

@RestController
public class WeatherController {

    private final WeatherService service;
    private final WeatherRequestService weatherRequestService;

    public WeatherController(WeatherService service, WeatherRequestService weatherRequestService) {
        this.service = service;
        this.weatherRequestService = weatherRequestService;
    }

    @GetMapping("weather")
    Weather getCityWeather(@RequestParam String city) {
        Weather weather = service.getWeather(city);
        weatherRequestService.saveWeatherRequest(LocalDateTime.now(), weather.getName(), weather.toString());
        return weather;
    }
}
