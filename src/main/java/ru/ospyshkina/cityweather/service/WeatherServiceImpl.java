package ru.ospyshkina.cityweather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.ospyshkina.cityweather.component.WebClient;
import ru.ospyshkina.cityweather.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WebClient webClient;
    private final WeatherRequestService weatherRequestService;
    private final Logger logger = LoggerFactory.getLogger(WeatherRequestServiceImpl.class);

    public WeatherServiceImpl(WebClient webClient, WeatherRequestService weatherRequestService) {
        this.webClient = webClient;
        this.weatherRequestService = weatherRequestService;
    }

    @Override
    public Weather getWeather(String city) {
        logger.info("Trying to get a weather of {}...", city);
        Weather weather = webClient.getCityWeather(city);
        logger.info("The weather of {} was successfully received!", city);
        weatherRequestService.saveWeatherRequest(weather);
        return weather;
    }
}
