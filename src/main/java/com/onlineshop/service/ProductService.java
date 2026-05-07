package com.onlineshop.service;

import com.onlineshop.dao.CategoryDao;
import com.onlineshop.dao.ProductDao;
import com.onlineshop.model.Category;
import com.onlineshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private CategoryDao categoryDao;

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    public Product getProductById(int id) {
        return productDao.findById(id);
    }

    public List<Product> getProductsByCategory(int categoryId) {
        return productDao.findByCategoryId(categoryId);
    }

    public List<Product> searchProducts(String keyword) {
        return productDao.searchByName(keyword);
    }

    public List<Category> getAllCategories() {
        return categoryDao.findAll();
    }
}
