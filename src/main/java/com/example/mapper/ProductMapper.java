package com.example.mapper;

import org.mapstruct.Mapper;

@Mapper
public abstract class ProductMapper {

    public static final String PRODUCT = "product";

    public abstract ProductDto productToProductDto(Product product);

    public ProductDto customProductToProductDto(Product product) {

        return new ProductDtoBuilder()
                .setName(product.getName())
                .setTier(product.getTier())
                .createProductDto();
    }
}
