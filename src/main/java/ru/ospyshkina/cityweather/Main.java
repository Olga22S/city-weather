package ru.ospyshkina.cityweather;

import org.springframework.web.client.RestTemplate;
import ru.ospyshkina.cityweather.component.WebClient;
import ru.ospyshkina.cityweather.model.Weather;
import ru.ospyshkina.cityweather.service.WeatherRequestServiceImpl;

public class Main {

    public static void main(String[] args) {
        WebClient client = new WebClient(new RestTemplate());
        Weather city = client.getCityWeather("Moscow");
        System.out.println(city);

    }
}
