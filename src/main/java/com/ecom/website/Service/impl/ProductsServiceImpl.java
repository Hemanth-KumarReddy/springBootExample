package com.ecom.website.Service.impl;

import com.ecom.website.DTO.ProductsDTO;
import com.ecom.website.Entity.Categories;
import com.ecom.website.Entity.Products;
import com.ecom.website.Mapper.ProductsMapper;
import com.ecom.website.Repository.CategoriesRepository;
import com.ecom.website.Repository.ProductsRepository;
import com.ecom.website.Service.ProductsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsServices {

   private final ProductsRepository productsRepository;
   private final CategoriesRepository categoriesRepository;

//    @Autowired
//    public ProductsServiceImpl(ProductsRepository productsRepository) {
//        this.productsRepository = productsRepository;
//    }

    @Override
    public ProductsDTO createProduct(Long categoryId,ProductsDTO productsDTO) {

        Categories categories = categoriesRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category Not Found"));
        productsDTO.setCategory(categories);
        Products products = ProductsMapper.mapToProducts(productsDTO);
        Products savedProducts = productsRepository.save(products);
        return ProductsMapper.mapToProductsDto(savedProducts);
    }
}
