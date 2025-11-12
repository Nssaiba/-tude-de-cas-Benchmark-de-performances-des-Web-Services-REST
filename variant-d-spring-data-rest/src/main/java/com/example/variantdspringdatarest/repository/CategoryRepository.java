package com.example.variantdspringdatarest.repository;

import com.example.variantdspringdatarest.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "categories")
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // ✅ Utilisez JpaRepository pour avoir toutes les méthodes CRUD
}