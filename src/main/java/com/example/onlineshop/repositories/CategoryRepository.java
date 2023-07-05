package com.example.onlineshop.repositories;

import com.example.onlineshop.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoriesById(Long id);
    Category findCategoriesByName(String name);
}
