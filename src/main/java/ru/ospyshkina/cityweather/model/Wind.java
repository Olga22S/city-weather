package ru.ospyshkina.cityweather.model;

import java.util.Objects;

public class Wind {

    private double speed;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wind)) return false;
        Wind wind = (Wind) o;
        return Double.compare(wind.speed, speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    @Override
    public String toString() {
        return "Wind{" +
                "speed=" + speed +
                '}';
    }
}
