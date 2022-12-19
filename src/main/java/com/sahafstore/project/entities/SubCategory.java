package com.sahafstore.project.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SubCategories")
@Data
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subCategory_id")
    Long subCategory_id;

    @Column(name = "name")
    String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category Category;

}
