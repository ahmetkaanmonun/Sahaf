package com.sahafstore.project.repositories;

import com.sahafstore.project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findProductsByTitle(String title);

    List<Product> findProductsByAuthor(String author);

    List<Product> findProductsByPublisher(String publisher);


    List<Product> findProductsByPlaceOfPublication(String placeOfPublication);


    List<Product> findProductsByPublishedYear(String publishedYear);

    List<Product> findProductsByLanguage(String language);

    List<Product> findProductsByPriceDesc(BigDecimal price);

}
