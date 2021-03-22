package com.fruits.api.service;

import com.fruits.api.api.v1.mapper.CategoryMapper;
import com.fruits.api.api.v1.model.CategoryDTO;
import com.fruits.api.repositories.CategoryRepository;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryMapper categoryMapper, CategoryRepository categoryRepository) {
        this.categoryMapper = categoryMapper;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        return null;
    }


    @Override
    public CategoryDTO getCategoryByName(String name) {
        return null;
    }
}
