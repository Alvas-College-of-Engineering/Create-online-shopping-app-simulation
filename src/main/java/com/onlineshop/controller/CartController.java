package com.onlineshop.controller;

import com.onlineshop.model.Cart;
import com.onlineshop.model.Product;
import com.onlineshop.service.ProductService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ProductService productService;

    private Cart getCart(HttpSession session) {
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart == null) {
            cart = new Cart();
            session.setAttribute("cart", cart);
        }
        return cart;
    }

    @GetMapping
    public String viewCart() {
        return "cart";
    }

    @PostMapping("/add")
    public String addToCart(@RequestParam int productId, @RequestParam(defaultValue = "1") int quantity, HttpSession session) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            Cart cart = getCart(session);
            cart.addItem(product, quantity);
        }
        return "redirect:/cart";
    }

    @PostMapping("/update")
    public String updateCart(@RequestParam int productId, @RequestParam int quantity, HttpSession session) {
        Cart cart = getCart(session);
        cart.updateItem(productId, quantity);
        return "redirect:/cart";
    }

    @GetMapping("/remove/{productId}")
    public String removeFromCart(@PathVariable int productId, HttpSession session) {
        Cart cart = getCart(session);
        cart.removeItem(productId);
        return "redirect:/cart";
    }
}
