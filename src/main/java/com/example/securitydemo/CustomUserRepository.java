package com.example.securitydemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomUserRepository extends JpaRepository<CustomUserDetails, Long> {
    CustomUserDetails findByName(String name);
}
