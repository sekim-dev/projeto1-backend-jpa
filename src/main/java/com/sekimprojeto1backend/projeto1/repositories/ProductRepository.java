package com.sekimprojeto1backend.projeto1.repositories;

import com.sekimprojeto1backend.projeto1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
