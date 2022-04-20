package ru.ospyshkina.cityweather.service;

import org.springframework.stereotype.Service;
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
    public void saveWeatherRequest(LocalDateTime date, String param, String result) {
        WeatherRequest weatherRequest = new WeatherRequest(date, param, result);
        repository.save(weatherRequest);
    }
}
