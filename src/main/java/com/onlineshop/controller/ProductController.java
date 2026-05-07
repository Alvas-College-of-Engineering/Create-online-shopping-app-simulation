package com.onlineshop.controller;

import com.onlineshop.model.Product;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String products(@RequestParam(required = false) Integer category,
                           @RequestParam(required = false) String search,
                           Model model) {
        model.addAttribute("categories", productService.getAllCategories());
        
        List<Product> productsToDisplay;
        if (search != null && !search.trim().isEmpty()) {
            productsToDisplay = productService.searchProducts(search.trim());
        } else if (category != null) {
            productsToDisplay = productService.getProductsByCategory(category);
        } else {
            productsToDisplay = productService.getAllProducts();
        }
        
        java.util.Map<String, java.util.List<Product>> groupedProducts = new java.util.LinkedHashMap<>();
        for (com.onlineshop.model.Category cat : productService.getAllCategories()) {
            java.util.List<Product> catProducts = productsToDisplay.stream()
                .filter(p -> p.getCategory() != null && p.getCategory().getId() == cat.getId())
                .collect(java.util.stream.Collectors.toList());
            if (!catProducts.isEmpty()) {
                groupedProducts.put(cat.getName(), catProducts);
            }
        }
        model.addAttribute("groupedProducts", groupedProducts);
        
        return "products";
    }

    @GetMapping("/products/{id}")
    public String productDetail(@PathVariable int id, Model model) {
        Product product = productService.getProductById(id);
        if (product == null) {
            return "redirect:/products";
        }
        model.addAttribute("product", product);
        return "product-detail";
    }
}
