package ru.ospyshkina.cityweather.model;

import java.util.Objects;

public class WeatherIndicators {

    private double temp;
    private double feelsLike;
    private double tempMin;
    private double tempMax;
    private int pressure;
    private int humidity;

    public WeatherIndicators() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WeatherIndicators)) return false;
        WeatherIndicators that = (WeatherIndicators) o;
        return Double.compare(that.temp, temp) == 0
                && Double.compare(that.feelsLike, feelsLike) == 0
                && Double.compare(that.tempMin, tempMin) == 0
                && Double.compare(that.tempMax, tempMax) == 0
                && pressure == that.pressure && humidity == that.humidity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, feelsLike, tempMin, tempMax, pressure, humidity);
    }

    @Override
    public String toString() {
        return "WeatherIndicators{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", tempMin=" + tempMin +
                ", tempMax=" + tempMax +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }
}
