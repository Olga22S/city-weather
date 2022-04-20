package ru.ospyshkina.cityweather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ospyshkina.cityweather.model.WeatherRequest;

@Repository
public interface WeatherRequestRepository extends JpaRepository<WeatherRequest, Long> {
}
