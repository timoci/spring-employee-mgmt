package com.dinesh.emp.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dinesh.emp.springsecurity.model.Users;
import com.dinesh.emp.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    Users findByEmail(String email);

    Users save(UserRegistrationDto registration);
}
