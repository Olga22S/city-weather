package ru.ospyshkina.cityweather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ospyshkina.cityweather.model.Weather;
import ru.ospyshkina.cityweather.service.WeatherService;

@RestController
public class WeatherController {

    private final WeatherService service;


    public WeatherController(WeatherService service) {
        this.service = service;
    }

    @GetMapping("weather")
    Weather getCityWeather(@RequestParam String city) {
        return service.getWeather(city);
    }
}
