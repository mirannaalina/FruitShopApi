package com.fruits.api.api.v1.mapper;


import com.fruits.api.api.v1.model.CategoryDTO;
import com.fruits.api.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source="id", target ="id")
    CategoryDTO categoryToCategoryDTO(Category category);
}
