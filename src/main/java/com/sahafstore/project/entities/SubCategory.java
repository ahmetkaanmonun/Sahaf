package com.sahafstore.project.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "SUBCATEGORIES")
@Data
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subCategory_id")
    Long subCategory_id;

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Category category;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "subCategory")
    private List<Product> products;

}
