package com.example.mapper;

import java.util.Objects;

public class ProductDto {

    private String name;
    private String tier;

    public ProductDto() {
        this(null, null);
    }

    public ProductDto(String name, String tier) {
        this.name = name;
        this.tier = tier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductDto that = (ProductDto) o;
        return Objects.equals(name, that.name)
                && Objects.equals(tier, that.tier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tier);
    }

    @Override
    public String toString() {
        return "ProductDto{" + "name='" + name + '\'' + ", tier='" + tier + '\'' + '}';
    }
}
