package com.sahafstore.project.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "PRODUCTS")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "title")
    String title;

    @Column(name = "author")
    String author;

    @Column(name = "publisher")
    String publisher;

    @Column(name = "placeOfPublication")
    String placeOfPublication;

    @Column(name = "publishedYear")
    String publishedYear;

    @Column(name = "language")
    String language;

    @Column(name = "size")
    String size;

    @Column(name = "page")
    String page;

    @Column(name = "status")
    String status;

    @Column(name = "bookBinding")
    String bookBinding;

    @Column(name = "price")
    String price;

    @Column(name = "description")
    String description;

    @Column(name = "isbn")
    String isbn;

    @Column(name = "creationDate")
    Date creationDate;

    @Column(name = "imageUrl")
    String imageUrl;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @ManyToOne
    @JoinColumn(name="subCategory_id", nullable=false)
    private SubCategory subCategory;


}
