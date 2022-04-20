package ru.ospyshkina.cityweather.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import ru.ospyshkina.cityweather.component.WebClient;
import ru.ospyshkina.cityweather.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WebClient webClient;
    private final Logger logger = LoggerFactory.getLogger(WeatherRequestServiceImpl.class);

    public WeatherServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    @Cacheable("weather_resquest")
    public Weather getWeather(String city) {
        logger.info("Trying to get a weather of ={}...", city);
        Weather weather = webClient.getCityWeather(city);
        logger.info("The weather of ={} was successfully received!", city);
        return weather;
    }
}
