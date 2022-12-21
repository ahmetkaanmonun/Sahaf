package com.sahafstore.project.services;

import com.sahafstore.project.entities.Product;
import com.sahafstore.project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Product newProduct) {
        Optional<Product> product = productRepository.findById(newProduct.getId());
        if (product.isPresent()){
            Product exist = product.get();
            exist.setId(newProduct.getId());
            exist.setCategory(newProduct.getCategory());
            exist.setPrice(newProduct.getPrice());
            exist.setLanguage(newProduct.getLanguage());
            exist.setStatus(newProduct.getStatus());
            exist.setAuthor(newProduct.getAuthor());
            exist.setSubCategory(newProduct.getSubCategory());
            exist.setTitle(newProduct.getTitle());
            exist.setPublisher(newProduct.getPublisher());
            return productRepository.save(exist);
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getAllProductsByTitle(String title) {
        return productRepository.findByTitle(title);
    }

    public List<Product> getAllProductsByAuthor(String author) {
        return productRepository.findByAuthor(author);
    }

    public List<Product> getAllProductsByPublisher(String publisher) {
        return productRepository.findByPublisher(publisher);
    }

    public List<Product> getAllProductsByCategory(Long categoryId) {
        return productRepository.findAllById(Collections.singleton(categoryId));
    }

    public List<Product> getAllProductsBySubCategory(Long subCategoryId) {
        return productRepository.findAllById(Collections.singleton(subCategoryId));
    }
}
