package com.sahafstore.project.controllers;

import com.sahafstore.project.dtos.CreateSubCategoryDTO;
import com.sahafstore.project.dtos.UpdateSubCategoryDTO;
import com.sahafstore.project.entities.SubCategory;
import com.sahafstore.project.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    // Create a subcategory
    @PostMapping("/subcategories")
    public SubCategory createSubCategory(@RequestBody CreateSubCategoryDTO createSubCategoryDTO){
        return subCategoryService.createSubCategory(createSubCategoryDTO);
    }

    // Update a subcategory
    @PutMapping("/subcategories/{id}")
    public SubCategory updateSubCategory(@RequestBody UpdateSubCategoryDTO updateSubCategoryDTO,@PathVariable Long id){
        return subCategoryService.updateSubCategory(updateSubCategoryDTO,id);
    }

    // Delete a subcategory
    @DeleteMapping("/subcategories/{id}")
    public void deleteSubCategory(@PathVariable Long id){
        subCategoryService.deleteSubCategory(id);
    }

    // Get subcategories category

    // Get products in subcategory
}
