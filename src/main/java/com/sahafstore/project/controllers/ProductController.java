package com.sahafstore.project.controllers;

import com.sahafstore.project.entities.Category;
import com.sahafstore.project.entities.Product;
import com.sahafstore.project.entities.SubCategory;
import com.sahafstore.project.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // Create a product

    @PostMapping("products")
    public Product createProduct(@RequestBody Product newProduct){
        return productService.createProduct(newProduct);
    }

    // Delete a product

    @DeleteMapping("products")
    public void deleteProduct(Long id){
        productService.deleteProductById(id);
    }

    // Update a product

    @PutMapping("products")
    public Product updateProduct(Product product){
        return productService.updateProduct(product);
    }

    // List all products

    @GetMapping("products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    // List products by title

    @GetMapping("products/{title}")
    public List<Product> getAllProductsByTitle(String title){
        return productService.getAllProductsByTitle(title);
    }

    // List  products by author

    @GetMapping("products/{author}")
    public List<Product> getAllProductsByAuthor(String author){
        return productService.getAllProductsByAuthor(author);
    }

    // List products by publisher

    @GetMapping("products/{publisher}")
    public List<Product> getAllProductsByPublisher(String publisher){
        return productService.getAllProductsByPublisher(publisher);
    }
    // List products by category

    @GetMapping("products/{category}")
    public List<Product> getAllProductsByCategory(Category category){
        return productService.getAllProductsByCategory(category.getCategory_id());
    }

    // List products by subcategory
    @GetMapping("products/{category}")
    public List<Product> getAllProductsBySubCategory(SubCategory subCategory){
        return productService.getAllProductsBySubCategory(subCategory.getSubCategory_id());
    }
}
