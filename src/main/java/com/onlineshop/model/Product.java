package com.onlineshop.model;

import java.sql.Timestamp;

public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private int categoryId;
    private String imageUrl;
    private Timestamp createdAt;
    
    // Category object for displaying category name
    private Category category;

    public Product() {
    }

    public Product(String name, String description, double price, int stockQuantity, int categoryId, String imageUrl) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.categoryId = categoryId;
        this.imageUrl = imageUrl;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getStockQuantity() { return stockQuantity; }
    public void setStockQuantity(int stockQuantity) { this.stockQuantity = stockQuantity; }
    public int getCategoryId() { return categoryId; }
    public void setCategoryId(int categoryId) { this.categoryId = categoryId; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }
}
