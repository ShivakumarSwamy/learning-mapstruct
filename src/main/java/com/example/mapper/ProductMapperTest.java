package com.example.mapper;

import java.util.logging.Logger;

public class ProductMapperTest {

    private static final Logger LOG = Logger.getLogger(ProductMapperTest.class.getSimpleName());

    public static void main(String[] args) {

        ProductMapper productMapper = new ProductMapperImpl();

        Product product = new Product();
        product.setName("name-1");
        product.setTier("tier-1");
        LOG.info(product.toString());

        ProductDto productDto = productMapper.productToProductDto(product);
        LOG.info(productDto.toString());

        ProductDto productDtoTwo = productMapper.customProductToProductDto(product);
        LOG.info(productDtoTwo.toString());
    }
}
