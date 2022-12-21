package com.sahafstore.project.repositories;

import com.sahafstore.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByTitle(String title);

    List<Product> findByAuthor(String author);

    List<Product> findByPublisher(String publisher);
}
