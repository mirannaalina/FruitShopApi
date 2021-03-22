package com.fruits.api.service;

import com.fruits.api.api.v1.model.CategoryDTO;

import java.util.List;

public interface CategoryService {


    List<CategoryDTO>  getAllCategories();

    CategoryDTO getCategoryByName(String name);


}
