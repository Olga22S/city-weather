package ru.ospyshkina.cityweather.model;

import java.util.Objects;

public class SenseWeather {

    private String main;
    private String description;

    public SenseWeather() {
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SenseWeather)) return false;
        SenseWeather that = (SenseWeather) o;
        return main.equals(that.main) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(main, description);
    }

    @Override
    public String toString() {
        return "SenseWeather{" +
                "main='" + main + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
