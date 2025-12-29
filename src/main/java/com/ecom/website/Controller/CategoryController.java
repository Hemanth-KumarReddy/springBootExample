package com.ecom.website.Controller;


import com.ecom.website.DTO.CategoriesDTO;
import com.ecom.website.Entity.Categories;
import com.ecom.website.Service.CategoriesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
    private CategoriesService categoriesService;

    public CategoryController(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    //Add Categories Rest API
    @PostMapping
    public ResponseEntity<CategoriesDTO> addCategory(@RequestBody CategoriesDTO categoriesDTO){
        return new ResponseEntity<>(categoriesService.createCategory(categoriesDTO), HttpStatus.CREATED);
    }
    //Get All Categories
    @GetMapping("/getAllCategories")
    public ResponseEntity<List<CategoriesDTO>> getAllCategories(){
        List<CategoriesDTO> categoriesDTOList = categoriesService.getAllCategories();
        return ResponseEntity.ok(categoriesDTOList);
    }
}
