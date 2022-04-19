package ru.ospyshkina.cityweather.service;

import org.springframework.stereotype.Service;
import ru.ospyshkina.cityweather.component.WebClient;
import ru.ospyshkina.cityweather.model.Weather;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final WebClient webClient;

    public WeatherServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public Weather getWeather(String city) {
        return webClient.getCityWeather(city);
    }
}
