package com.sahafstore.project.repositories;

import com.sahafstore.project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
