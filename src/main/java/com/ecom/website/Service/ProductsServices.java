package com.ecom.website.Service;

import com.ecom.website.DTO.ProductsDTO;

public interface ProductsServices {

ProductsDTO createProduct(Long categoryId,ProductsDTO productsDTO);
}
