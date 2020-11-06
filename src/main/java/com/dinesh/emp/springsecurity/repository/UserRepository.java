package com.dinesh.emp.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dinesh.emp.springsecurity.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
}
