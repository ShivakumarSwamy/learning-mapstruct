package com.example.mapper;

import java.util.Objects;

public class Car {

    private String name;
    private String make;
    private Integer numberOfSeats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
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
}
