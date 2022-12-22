package com.sahafstore.project.services;

import com.sahafstore.project.dtos.CreateCategoryDTO;
import com.sahafstore.project.dtos.UpdateCategoryDTO;
import com.sahafstore.project.entities.Category;
import com.sahafstore.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    public Category createCategory(CreateCategoryDTO createCategoryDTO) {
        return categoryRepository.save(createCategoryDTO.toEntity());
    }

    public Category updateCategory(UpdateCategoryDTO updateCategoryDto, Long id) {
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(updateCategoryDto.getName());
                    return categoryRepository.save(category);
                })
                .orElseGet(() -> {
                    updateCategoryDto.setName(updateCategoryDto.getName());
                    return categoryRepository.save(updateCategoryDto.toEntity());
                });
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
