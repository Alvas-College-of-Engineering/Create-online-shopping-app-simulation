package com.onlineshop.model;

import java.sql.Timestamp;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String role;
    private String fullName;
    private String address;
    private String phone;
    private Timestamp createdAt;

    // Default constructor
    public User() {
    }

    // Parameterized constructor
    public User(String username, String password, String email, String role, String fullName, String address, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
