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
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "placeOfPublication")
    private String placeOfPublication;

    @Column(name = "publishedYear")
    private String publishedYear;

    @Column(name = "language")
    private String language;

    @Column(name = "size")
    private String size;

    @Column(name = "page")
    private String page;

    @Column(name = "status")
    private String status;

    @Column(name = "bookBinding")
    private String bookBinding;

    @Column(name = "price")
    private double price;

    @Column(name = "description")
    private String description;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "creationDate")
    private String creationDate;

    @Column(name = "imageUrl")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @ManyToOne
    @JoinColumn(name="subCategory_id", nullable=false)
    private SubCategory subCategory;


}
