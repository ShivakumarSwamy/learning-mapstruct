package com.example.mapper;

import java.util.Objects;

public class PersonDto {

    private String name;
    private String age;

    public PersonDto(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonDto personDto = (PersonDto) o;
        return Objects.equals(name, personDto.name)
                && Objects.equals(age, personDto.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonDto{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
    }
}
