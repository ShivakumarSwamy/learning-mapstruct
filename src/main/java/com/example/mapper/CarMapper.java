package com.example.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface CarMapper {

    CarDto carToCarDto(Car car);

}
