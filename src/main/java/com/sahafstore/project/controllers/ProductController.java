package com.sahafstore.project.controllers;


import com.sahafstore.project.dtos.CreateProductDTO;
import com.sahafstore.project.dtos.UpdateProductDTO;
import com.sahafstore.project.entities.Product;
import com.sahafstore.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



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

    // Get products by author

    // Get products by publisher

    // Get products by placeOfPublication

    // Get products by publishedYear

    // Get products by language

    // Sort products by price desc

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
