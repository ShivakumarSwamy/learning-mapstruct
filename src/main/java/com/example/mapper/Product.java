package com.example.mapper;

import java.util.Objects;

public class Product {

    private String name;
    private String tier;

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
        Product product = (Product) o;
        return Objects.equals(name, product.name)
                && Objects.equals(tier, product.tier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tier);
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", tier='" + tier + '\'' + '}';
    }
}
