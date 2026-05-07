package com.onlineshop.model;

public class CartItem {
    private int productId;
    private Product product;
    private int quantity;

    public CartItem() {
    }

    public CartItem(Product product, int quantity) {
        this.productId = product.getId();
        this.product = product;
        this.quantity = quantity;
    }

    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double getSubtotal() {
        return this.product.getPrice() * this.quantity;
    }
}
