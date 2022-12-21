package com.sahafstore.project.controllers;

import com.sahafstore.project.services.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/subcategories")
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    // Add a subcategory

    // Delete a subcategory

    // Update a subcategory


}
