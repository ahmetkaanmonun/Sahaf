package com.sahafstore.project.services;

import com.sahafstore.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;



}
