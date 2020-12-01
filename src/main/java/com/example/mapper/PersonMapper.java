package com.example.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    default PersonDto customPersonToPersonDto(Person person) {
        return new PersonDtoBuilder()
                .setAge(person.getAge())
                .setName(person.getName())
                .createPersonDto();
    }
}
