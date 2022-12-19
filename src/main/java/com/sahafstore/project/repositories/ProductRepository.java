package com.sahafstore.project.repositories;

import com.sahafstore.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
