package com.example.mapper;

public class PersonDtoBuilder {
    private String name;
    private String age;

    public PersonDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonDtoBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public PersonDto createPersonDto() {
        return new PersonDto(name, age);
    }
}