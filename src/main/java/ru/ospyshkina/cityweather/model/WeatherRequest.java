package ru.ospyshkina.cityweather.model;

import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class WeatherRequest {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    private String param;
    private String result;

    public WeatherRequest() {
    }

    public WeatherRequest(LocalDateTime date, String param, String result) {
        this.date = date;
        this.param = param;
        this.result = result;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
            return false;
        }
        WeatherRequest that = (WeatherRequest) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public String toString() {
        return "WeatherRequest{" +
                "id=" + id +
                ", date=" + date +
                ", param='" + param + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
