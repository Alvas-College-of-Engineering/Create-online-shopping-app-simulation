package com.onlineshop.controller;

import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.GetMapping;

import java.util.List;
import com.onlineshop.model.Product;

@Controller
public class HomeController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home(Model model) {
        List<Product> allProducts = productService.getAllProducts();
        List<Product> featuredProducts = allProducts.subList(0, Math.min(8, allProducts.size()));
        
        model.addAttribute("products", featuredProducts);
        model.addAttribute("categories", productService.getAllCategories());
        return "index";
    }
}
