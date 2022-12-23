package com.sahafstore.project.services;

import com.sahafstore.project.dtos.CreateProductDTO;
import com.sahafstore.project.dtos.UpdateProductDTO;
import com.sahafstore.project.entities.Product;
import com.sahafstore.project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(CreateProductDTO createProductDTO) {
        return productRepository.save(createProductDTO.toEntity());
    }

    public Product updateProduct(UpdateProductDTO updateProductDTO, Long id) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setSize(updateProductDTO.getSize());
                    product.setPage(updateProductDTO.getPage());
                    product.setIsbn(updateProductDTO.getIsbn());
                    product.setDescription(updateProductDTO.getDescription());
                    product.setImageUrl(updateProductDTO.getImageUrl());
                    product.setCategory(updateProductDTO.getCategory());
                    product.setPlaceOfPublication(updateProductDTO.getPlaceOfPublication());
                    product.setCreationDate(updateProductDTO.getCreationDate());
                    product.setSubCategory(updateProductDTO.getSubCategory());
                    product.setBookBinding(updateProductDTO.getBookBinding());
                    product.setLanguage(updateProductDTO.getLanguage());
                    product.setPrice(updateProductDTO.getPrice());
                    product.setStatus(updateProductDTO.getStatus());
                    product.setTitle(updateProductDTO.getTitle());
                    product.setAuthor(updateProductDTO.getAuthor());
                    product.setPublishedYear(updateProductDTO.getPublishedYear());
                    return productRepository.save(product);
                })
                .orElseGet(() -> {
                    updateProductDTO.setAuthor(updateProductDTO.getAuthor());
                    updateProductDTO.setLanguage(updateProductDTO.getLanguage());
                    updateProductDTO.setPrice(updateProductDTO.getPrice());
                    updateProductDTO.setStatus(updateProductDTO.getStatus());
                    updateProductDTO.setCategory(updateProductDTO.getCategory());
                    updateProductDTO.setTitle(updateProductDTO.getTitle());
                    updateProductDTO.setIsbn(updateProductDTO.getIsbn());
                    updateProductDTO.setDescription(updateProductDTO.getDescription());
                    updateProductDTO.setPage(updateProductDTO.getPage());
                    updateProductDTO.setSize(updateProductDTO.getSize());
                    updateProductDTO.setBookBinding(updateProductDTO.getBookBinding());
                    updateProductDTO.setImageUrl(updateProductDTO.getImageUrl());
                    updateProductDTO.setCreationDate(updateProductDTO.getCreationDate());
                    updateProductDTO.setPublishedYear(updateProductDTO.getPublishedYear());
                    updateProductDTO.setSubCategory(updateProductDTO.getSubCategory());
                    updateProductDTO.setPlaceOfPublication(updateProductDTO.getPlaceOfPublication());

                    return productRepository.save(updateProductDTO.toEntity());
                });
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByTitle(String title) {
        return productRepository.findProductsByTitle(title);
    }

    public List<Product> getProductsByAuthor(String author) {
        return productRepository.findProductsByAuthor(author);
    }

    public List<Product> getProductsByPublisher(String publisher) {
        return productRepository.findProductsByPublisher(publisher);
    }

    public List<Product> getProductsByPlaceOfPublication(String placeOfPublication) {
        return productRepository.findProductsByPlaceOfPublication(placeOfPublication);
    }

    public List<Product> getProductsByPublishedYear(String publishedYear) {
        return productRepository.findProductsByPublishedYear(publishedYear);
    }

    public List<Product> getProductsByLanguage(String language) {
        return productRepository.findProductsByLanguage(language);
    }

    public List<Product> getProductsByDescPrice(double price) {
        List<Product> products = productRepository.findProductsByPrice(price);
        Collections.sort(products,Collections.reverseOrder());
        return products;
    }

    public List<Product> getProductsByAscPrice(double price) {
        List<Product> products = productRepository.findProductsByPrice(price);
        products = products.stream().sorted().collect(Collectors.toList());
        return products;
    }

    public List<Product> getProductsByDescPublishedYear(String publishedYear) {
        List<Product> products = productRepository.findProductsByPublishedYear(publishedYear);
        Collections.sort(products,Collections.reverseOrder());
        return products;
    }

    public List<Product> getProductsByAscPublishedYear(String publishedYear) {
        List<Product> products = productRepository.findProductsByPublishedYear(publishedYear);
        products = products.stream().sorted().collect(Collectors.toList());
        return products;
    }

    public List<Product> getProductsByAscAuthor(String author) {
        List<Product> products = productRepository.findProductsByAuthor(author);
        products = products.stream().sorted().collect(Collectors.toList());
        return products;
    }

    public List<Product> getProductsByDescAuthor(String author) {
        List<Product> products = productRepository.findProductsByAuthor(author);
        Collections.sort(products,Collections.reverseOrder());
        return products;
    }

    public List<Product> getProductsByAscTitle(String title) {
        List<Product> products = productRepository.findProductsByTitle(title);
        products = products.stream().sorted().collect(Collectors.toList());
        return products;
    }

    public List<Product> getProductsByDescTitle(String title) {
        List<Product> products = productRepository.findProductsByTitle(title);
        Collections.sort(products,Collections.reverseOrder());
        return products;
    }
}
