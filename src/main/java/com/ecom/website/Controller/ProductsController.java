package com.ecom.website.Controller;

import com.ecom.website.DTO.ProductsDTO;
import com.ecom.website.Entity.Products;
import com.ecom.website.Service.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductsController {

    private final ProductsServices productsServices;



    @Autowired
    ProductsController(ProductsServices productsServices){
        this.productsServices=productsServices;
    }

    @PostMapping("/{categoryId}")
    public ResponseEntity<ProductsDTO> addProduct(@PathVariable Long categoryId, @RequestBody ProductsDTO productsDTO){
        return new ResponseEntity<> (productsServices.createProduct(categoryId,productsDTO), HttpStatus.CREATED);
    }
}
