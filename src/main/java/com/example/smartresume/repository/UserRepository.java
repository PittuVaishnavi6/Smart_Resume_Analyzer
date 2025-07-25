package com.example.smartresume.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smartresume.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
