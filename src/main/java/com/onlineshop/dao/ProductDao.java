package com.onlineshop.dao;

import com.onlineshop.model.Category;
import com.onlineshop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Product> productRowMapper = new RowMapper<Product>() {
        @Override
        public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
            Product product = new Product();
            product.setId(rs.getInt("p_id"));
            product.setName(rs.getString("p_name"));
            product.setDescription(rs.getString("p_desc"));
            product.setPrice(rs.getDouble("p_price"));
            product.setStockQuantity(rs.getInt("p_stock"));
            product.setCategoryId(rs.getInt("p_cat_id"));
            product.setImageUrl(rs.getString("p_image"));
            product.setCreatedAt(rs.getTimestamp("p_created"));
            
            if (rs.getString("c_name") != null) {
                Category category = new Category();
                category.setId(rs.getInt("p_cat_id"));
                category.setName(rs.getString("c_name"));
                product.setCategory(category);
            }
            return product;
        }
    };

    private static final String BASE_SELECT = 
        "SELECT p.id as p_id, p.name as p_name, p.description as p_desc, p.price as p_price, " +
        "p.stock_quantity as p_stock, p.category_id as p_cat_id, p.image_url as p_image, " +
        "p.created_at as p_created, c.name as c_name " +
        "FROM products p LEFT JOIN categories c ON p.category_id = c.id";

    public List<Product> findAll() {
        return jdbcTemplate.query(BASE_SELECT, productRowMapper);
    }

    public Product findById(int id) {
        String sql = BASE_SELECT + " WHERE p.id = ?";
        List<Product> products = jdbcTemplate.query(sql, productRowMapper, id);
        return products.isEmpty() ? null : products.get(0);
    }
    
    public List<Product> findByCategoryId(int categoryId) {
        String sql = BASE_SELECT + " WHERE p.category_id = ?";
        return jdbcTemplate.query(sql, productRowMapper, categoryId);
    }
    
    public List<Product> searchByName(String keyword) {
        String sql = BASE_SELECT + " WHERE p.name LIKE ?";
        return jdbcTemplate.query(sql, productRowMapper, "%" + keyword + "%");
    }
}
