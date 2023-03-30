package com.example.fitnesscenter.repository;

import com.example.fitnesscenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
