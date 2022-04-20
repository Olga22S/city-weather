package ru.ospyshkina.cityweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CityWeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(CityWeatherApplication.class, args);
    }

}
