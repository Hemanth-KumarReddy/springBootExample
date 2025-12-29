package com.ecom.website.Mapper;

import com.ecom.website.DTO.ProductsDTO;
import com.ecom.website.Entity.Products;

public class ProductsMapper {

    public static ProductsDTO mapToProductsDto(Products products){

        ProductsDTO productsDTO = new ProductsDTO(
                products.getId(),
                products.getName(),
                products.getDescription(),
                products.getImageUrl(),
                products.getPrice(),
                products.getCategory()
        );

        return productsDTO;
    }

    public static Products mapToProducts(ProductsDTO productsDTO){

        Products products = new Products(
                productsDTO.getId(),
                productsDTO.getName(),
                productsDTO.getDescription(),
                productsDTO.getImageUrl(),
                productsDTO.getPrice(),
                productsDTO.getCategory()
        );
        return products;
    }
}
