package ru.ospyshkina.cityweather.component;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import ru.ospyshkina.cityweather.model.Weather;

import static ru.ospyshkina.cityweather.constants.ApiConstants.API_KEY;
import static ru.ospyshkina.cityweather.constants.ApiConstants.WEATHER_URL;

@Component
public class WebClient {

    private final RestTemplate restTemplate;

    public WebClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Weather getCityWeather(String city) {
        HttpHeaders httpHeaders = new HttpHeaders();
        String url = WEATHER_URL + city + API_KEY;
        ResponseEntity<Weather> entity = restTemplate.exchange(
                url,
                HttpMethod.GET,
                new HttpEntity<Weather>(httpHeaders),
                Weather.class
        );
        return entity.getBody();
    }
}
