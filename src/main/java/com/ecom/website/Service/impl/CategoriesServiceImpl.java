package com.ecom.website.Service.impl;

import com.ecom.website.DTO.CategoriesDTO;
import com.ecom.website.Entity.Categories;
import com.ecom.website.Mapper.CategoriesMapper;
import com.ecom.website.Repository.CategoriesRepository;
import com.ecom.website.Service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriesServiceImpl implements CategoriesService {

    private CategoriesRepository categoriesRepository;

    @Autowired
    public CategoriesServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public CategoriesDTO createCategory(CategoriesDTO categoriesDTO) {
        Categories categories = CategoriesMapper.mapToCategories(categoriesDTO);
        Categories savedCategories = categoriesRepository.save(categories);
        return CategoriesMapper.mapToCategoriesDto(savedCategories);
    }

    @Override
    public List<CategoriesDTO> getAllCategories() {
        List<Categories> categoriesList = categoriesRepository.findAll();
        return categoriesList.stream().map((category) -> CategoriesMapper.mapToCategoriesDto(category))
                .collect(Collectors.toList());

    }
}
