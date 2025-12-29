package com.ecom.website.Mapper;

import com.ecom.website.DTO.CategoriesDTO;
import com.ecom.website.Entity.Categories;

public class CategoriesMapper {

    public static Categories mapToCategories(CategoriesDTO categoriesDTO){
        Categories categories = new Categories(
                   categoriesDTO.getId(),
                   categoriesDTO.getName()
        );
        return categories;
    }

    public static CategoriesDTO mapToCategoriesDto(Categories categories){

        CategoriesDTO categoriesDTO = new CategoriesDTO(
                categories.getId(),
                categories.getName()
        );
        return categoriesDTO;
    }
}