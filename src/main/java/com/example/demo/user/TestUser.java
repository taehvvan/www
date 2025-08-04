package com.example.demo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TestUser {

    @Id
    private Long id;
    private String name;

    // 생성자, getter, setter
    public TestUser() {}

    public TestUser(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

