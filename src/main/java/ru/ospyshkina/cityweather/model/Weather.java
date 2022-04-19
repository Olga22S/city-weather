package ru.ospyshkina.cityweather.model;

import java.util.Arrays;
import java.util.Objects;

public class Weather {

    private String name;
    private SenseWeather[] weather;
    private WeatherIndicators main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;

    public Weather() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SenseWeather[] getWeather() {
        return weather;
    }

    public void setWeather(SenseWeather[] weather) {
        this.weather = weather;
    }

    public WeatherIndicators getMain() {
        return main;
    }

    public void setMain(WeatherIndicators main) {
        this.main = main;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;
        Weather weather1 = (Weather) o;
        return visibility == weather1.visibility
                && name.equals(weather1.name)
                && Arrays.equals(weather, weather1.weather)
                && main.equals(weather1.main)
                && wind.equals(weather1.wind)
                && clouds.equals(weather1.clouds);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, main, visibility, wind, clouds);
        result = 31 * result + Arrays.hashCode(weather);
        return result;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "name='" + name + '\'' +
                ", weather=" + Arrays.toString(weather) +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                '}';
    }
}
