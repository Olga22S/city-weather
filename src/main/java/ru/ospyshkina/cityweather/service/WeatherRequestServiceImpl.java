package ru.ospyshkina.cityweather.service;

import org.springframework.stereotype.Service;
import ru.ospyshkina.cityweather.model.Weather;
import ru.ospyshkina.cityweather.model.WeatherRequest;
import ru.ospyshkina.cityweather.repository.WeatherRequestRepository;

import java.time.LocalDateTime;

@Service
public class WeatherRequestServiceImpl implements WeatherRequestService {

    private final WeatherRequestRepository repository;

    public WeatherRequestServiceImpl(WeatherRequestRepository repository) {
        this.repository = repository;
    }

    @Override
    public void saveWeatherRequest(Weather weather) {
        WeatherRequest weatherRequest = new WeatherRequest(LocalDateTime.now(), weather.getName(), weather.toString());
        repository.save(weatherRequest);
    }
}
