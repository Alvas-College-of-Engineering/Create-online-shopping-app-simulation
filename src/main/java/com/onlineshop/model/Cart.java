package com.onlineshop.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProductId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public void updateItem(int productId, int quantity) {
        for (CartItem item : items) {
            if (item.getProductId() == productId) {
                item.setQuantity(quantity);
                return;
            }
        }
    }

    public void removeItem(int productId) {
        items.removeIf(item -> item.getProductId() == productId);
    }

    public double getTotalAmount() {
        return items.stream().mapToDouble(CartItem::getSubtotal).sum();
    }
    
    public int getTotalItems() {
        return items.stream().mapToInt(CartItem::getQuantity).sum();
    }
    
    public void clear() {
        items.clear();
    }
}
