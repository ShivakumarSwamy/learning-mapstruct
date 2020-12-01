package com.example.mapper;

import java.util.logging.Logger;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMapStructApplication {
    private static final Logger LOG = Logger.getLogger(SpringMapStructApplication.class.getSimpleName());

    public static void main(String[] args) {
        SpringApplication.run(SpringMapStructApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(CarMapper carMapper) {
        Car car = new Car();
        car.setMake("make-1");
        car.setName("name-1");
        car.setNumberOfSeats(1);

        return args -> {
            LOG.info(carMapper.carToCarDto(car).toString());
        };
    }
}
