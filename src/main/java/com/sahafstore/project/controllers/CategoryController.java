package com.sahafstore.project.controllers;

import com.sahafstore.project.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // Add a category

    // Delete a category

    // Update a category

    // List subcategories by category


}
