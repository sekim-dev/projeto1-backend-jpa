package com.sekimprojeto1backend.projeto1.repositories;

import com.sekimprojeto1backend.projeto1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {
}
