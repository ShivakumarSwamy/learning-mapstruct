package com.example.mapper;

import java.util.Objects;

public class CarDto {

    private String name;
    private String manufacturer;
    private Integer seatCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CarDto carDto = (CarDto) o;
        return Objects.equals(name, carDto.name)
                && Objects.equals(manufacturer, carDto.manufacturer)
                && Objects.equals(seatCount, carDto.seatCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, manufacturer, seatCount);
    }

    @Override
    public String toString() {
        return "CarDto{" + "name='" + name + '\'' + ", manufacturer='" + manufacturer + '\'' + ", seatCount=" + seatCount + '}';
    }
}

