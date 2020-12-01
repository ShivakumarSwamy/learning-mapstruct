package com.example.mapper;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

public class CarMapperCollectionTest {

    private static final Logger LOG = Logger.getLogger(CarMapperCollectionTest.class.getSimpleName());

    public static void main(String[] args) {
        CarMapper carMapper = new CarMapperImpl();

        Car car1 = new Car();
        car1.setName("name-1");
        car1.setMake("make-1");
        car1.setNumberOfSeats(1);
        LOG.info(car1.toString());

        Car car2 = new Car();
        car2.setName("name-2");
        car2.setMake("make-2");
        car2.setNumberOfSeats(2);
        LOG.info(car2.toString());

        Collection<CarDto> carDtos = carMapper.carsToCarDtos(Arrays.asList(car1, car2));
        LOG.info(carDtos.toString());
    }
}
