package com.example.mapper;

public class CarBuilder {
    private String name;
    private String make;
    private Integer numberOfSeats;

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public Car createCar() {
        return new Car(name, make, numberOfSeats);
    }
}