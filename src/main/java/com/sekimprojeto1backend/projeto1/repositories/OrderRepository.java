package com.sekimprojeto1backend.projeto1.repositories;

import com.sekimprojeto1backend.projeto1.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
