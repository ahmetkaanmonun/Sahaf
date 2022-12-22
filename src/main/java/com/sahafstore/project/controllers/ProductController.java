package com.sahafstore.project.controllers;


import com.sahafstore.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping( "/products")
public class ProductController {

    @Autowired
    private ProductService productService;




}
