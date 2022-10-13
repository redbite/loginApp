package com.example.loginApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loginApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
