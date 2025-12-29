package com.ecom.website.Service;

import com.ecom.website.DTO.CategoriesDTO;

import java.util.List;

public interface CategoriesService {

    CategoriesDTO createCategory(CategoriesDTO categoriesDTO);

    List<CategoriesDTO> getAllCategories();
}
