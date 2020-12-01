package com.example.mapper;

import java.util.logging.Logger;

public class CarMapperTest {

    private static final Logger LOG = Logger.getLogger(CarMapperTest.class.getSimpleName());

    public static void main(String[] args) {
        CarMapper carMapper = new CarMapperImpl();

        Car car = new Car();
        car.setName("name-1");
        car.setMake("make-1");
        car.setNumberOfSeats(1);
        LOG.info(car.toString());

        CarDto carDto = carMapper.carToCarDto(car);
        LOG.info(carDto.toString());
    }
}
