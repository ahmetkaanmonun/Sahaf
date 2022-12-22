package com.sahafstore.project.controllers;

import com.sahafstore.project.dtos.CreateCategoryDTO;
import com.sahafstore.project.dtos.UpdateCategoryDTO;
import com.sahafstore.project.entities.Category;
import com.sahafstore.project.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Create a category
    @PostMapping("/categories")
    public Category createCategory(@RequestBody CreateCategoryDTO createCategoryDTO){
        return categoryService.createCategory(createCategoryDTO);
    }

    // Update a category
    @PutMapping("/categories/{id}")
    public Category updateCategory(@RequestBody UpdateCategoryDTO updateCategoryDto, @PathVariable Long id){
        return categoryService.updateCategory(updateCategoryDto,id);
    }

    // Delete a category
    @DeleteMapping("/categories/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }

    // Get all products in category

    // Get all subcategories in category

}
