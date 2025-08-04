package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserRepository extends JpaRepository<TestUser, Long> {}