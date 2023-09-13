package com.sekimprojeto1backend.projeto1.repositories;

import com.sekimprojeto1backend.projeto1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
