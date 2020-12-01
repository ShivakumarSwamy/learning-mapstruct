package com.example.mapper;

import java.util.Objects;

public class Car {

    private final String name;
    private final String make;
    private final Integer numberOfSeats;

    public Car(String name, String make, Integer numberOfSeats) {
        this.name = name;
        this.make = make;
        this.numberOfSeats = numberOfSeats;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name)
                && Objects.equals(make, car.make)
                && Objects.equals(numberOfSeats, car.numberOfSeats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, make, numberOfSeats);
    }

    @Override
    public String toString() {
        return "Car{" + "name='" + name + '\'' + ", make='" + make + '\'' + ", numberOfSeats=" + numberOfSeats + '}';
    }
}
