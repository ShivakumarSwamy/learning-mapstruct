package com.example.mapper;

import java.util.logging.Logger;

public class CarMapperTest {

    private static final Logger LOG = Logger.getLogger(CarMapperTest.class.getSimpleName());

    public static void main(String[] args) {
        CarMapper carMapper = CarMapper.INSTANCE;

        CarDto carDto = new CarDto();
        carDto.setManufacturer("manufacturer-1");
        carDto.setName("name-1");
        carDto.setSeatCount(1);
        LOG.info(carDto.toString());

        Car car = carMapper.carDtoToCar(carDto);
        LOG.info(car.toString());
    }
}
