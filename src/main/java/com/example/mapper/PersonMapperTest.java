package com.example.mapper;

import java.util.logging.Logger;

public class PersonMapperTest {

    private static final Logger LOG = Logger.getLogger(PersonMapperTest.class.getSimpleName());

    public static void main(String[] args) {
        PersonMapper personMapper = new PersonMapperImpl();

        Person person = new Person("name-1", "age-1");
        LOG.info(person.toString());

        PersonDto personDto = personMapper.customPersonToPersonDto(person);
        LOG.info(personDto.toString());
    }
}
