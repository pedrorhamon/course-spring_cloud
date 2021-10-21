package com.starking.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starking.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
