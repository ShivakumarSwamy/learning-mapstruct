package com.example.mapper;

public class ProductDtoBuilder {
    private String name;
    private String tier;

    public ProductDtoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductDtoBuilder setTier(String tier) {
        this.tier = tier;
        return this;
    }

    public ProductDto createProductDto() {
        return new ProductDto(name, tier);
    }
}