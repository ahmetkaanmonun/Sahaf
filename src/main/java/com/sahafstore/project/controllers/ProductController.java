package com.sahafstore.project.controllers;


import com.sahafstore.project.dtos.CreateProductDTO;
import com.sahafstore.project.dtos.UpdateProductDTO;
import com.sahafstore.project.entities.Product;
import com.sahafstore.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create a product
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductDTO createProductDTO){
        return productService.createProduct(createProductDTO);
    }

    // Update a product
    @PutMapping("/products/{id}")
    public Product updateProduct(@RequestBody UpdateProductDTO updateProductDTO, @PathVariable Long id){
        return productService.updateProduct(updateProductDTO,id);
    }

    // Delete a product
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

    // Get products by title
    @GetMapping("/products/{title}")
    public List<Product> getProductsByTitle(String title){
        return productService.getProductsByTitle(title);
    }

    // Get products by author
    @GetMapping("/products/{author}")
    public List<Product> getProductsByAuthor(String author){
        return productService.getProductsByAuthor(author);
    }

    // Get products by publisher
    @GetMapping("/products/{publisher}")
    public List<Product> getProductsByPublisher(String publisher){
        return productService.getProductsByPublisher(publisher);
    }

    // Get products by placeOfPublication
    @GetMapping("/products/{placeOfPublication}")
    public List<Product> getProductsByPlaceOfPublication(String placeOfPublication){
        return productService.getProductsByPlaceOfPublication(placeOfPublication);
    }

    // Get products by publishedYear

    @GetMapping("/products/{publishedYear}")
    public List<Product> getProductsByPublishedYear(String publishedYear){
        return productService.getProductsByPublishedYear(publishedYear);
    }

    // Get products by language
    @GetMapping("/products/{language}")
    public List<Product> getProductsByLanguage(String language){
        return productService.getProductsByLanguage(language);

    }

    // Sort products by price desc
    @GetMapping("/products/sortByPriceDesc")
    public List<Product> getProductsByPriceDesc(BigDecimal price){
        return productService.findProductsByPriceDesc(price);
    }


    // Sort products by price asc

    // Sort products by publishedYear desc

    // Sort products by publishedYear asc

    // Sort products by author A to Z

    // Sort products by author Z to A

    // Sort products by title A to Z

    // Sort products by title A to Z

    // Sort products by isbn

    // Sort products by price interval (ex: 20 ==> 100)

    // Sort products by publisherYear interval (ex: 1994 ==> 2006)

    // Sort products for creationDate








}
