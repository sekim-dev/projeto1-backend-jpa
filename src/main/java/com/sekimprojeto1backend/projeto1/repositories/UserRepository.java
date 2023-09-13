package com.sekimprojeto1backend.projeto1.repositories;

import com.sekimprojeto1backend.projeto1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
