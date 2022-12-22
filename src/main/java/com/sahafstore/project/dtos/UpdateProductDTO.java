package com.sahafstore.project.dtos;

import com.sahafstore.project.entities.Category;
import com.sahafstore.project.entities.Product;
import com.sahafstore.project.entities.SubCategory;
import lombok.Data;

import java.sql.Date;

@Data
public class UpdateProductDTO {

    String title;
    String author;
    String publisher;
    String placeOfPublication;
    String publishedYear;
    String language;
    String size;
    String page;
    String status;
    String bookBinding;
    String price;
    String description;
    String isbn;
    Date creationDate;
    String imageUrl;
    private Category category;
    private SubCategory subCategory;

    public Product toEntity(){
        Product product = new Product();
        product.setAuthor(this.getAuthor());
        product.setTitle(this.getTitle());
        product.setPublisher(this.getPublisher());
        product.setStatus(this.getStatus());
        product.setPrice(this.getPrice());
        product.setLanguage(this.getLanguage());
        product.setCategory(this.getCategory());
        product.setSubCategory(this.getSubCategory());
        product.setBookBinding(this.getBookBinding());
        product.setCreationDate(this.getCreationDate());
        product.setDescription(this.getDescription());
        product.setPage(this.getPage());
        product.setIsbn(this.getIsbn());
        product.setPlaceOfPublication(this.getPlaceOfPublication());
        product.setImageUrl(this.getImageUrl());
        product.setSize(this.getSize());
        return product;
    }
}
