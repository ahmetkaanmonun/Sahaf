package com.sahafstore.project.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Products")
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
    @Column(name = "price")
    String price;

    @Column(name = "publisher")
    String publisher;
    @Column(name = "language")
    String language;

    @Column(name = "status")
    String status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "subCategory_id")
    private SubCategory subCategory;

}
