package com.sahafstore.project.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Table(name = "CATEGORIES")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long category_id;

    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private List<Product> products;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private List<SubCategory> subCategories;

}
