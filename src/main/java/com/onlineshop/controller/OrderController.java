package com.onlineshop.controller;

import com.onlineshop.model.Cart;
import com.onlineshop.model.User;
import com.onlineshop.service.OrderService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/checkout")
    public String checkoutPage(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        Cart cart = (Cart) session.getAttribute("cart");

        if (user == null) {
            return "redirect:/login?checkout=true";
        }
        if (cart == null || cart.getItems().isEmpty()) {
            return "redirect:/cart";
        }

        return "checkout";
    }

    @PostMapping("/checkout")
    public String placeOrder(@RequestParam String shippingAddress, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        Cart cart = (Cart) session.getAttribute("cart");

        if (user == null || cart == null || cart.getItems().isEmpty()) {
            return "redirect:/";
        }

        orderService.placeOrder(user, cart, shippingAddress);
        cart.clear(); // Empty the cart after successful order

        return "redirect:/order-history?success=true";
    }

    @GetMapping("/order-history")
    public String orderHistory(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }
        model.addAttribute("orders", orderService.getUserOrders(user.getId()));
        return "order-history";
    }
}
