package com.onlineshop.dao;

import com.onlineshop.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CategoryDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<Category> categoryRowMapper = new RowMapper<Category>() {
        @Override
        public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
            Category category = new Category();
            category.setId(rs.getInt("id"));
            category.setName(rs.getString("name"));
            category.setDescription(rs.getString("description"));
            return category;
        }
    };

    public List<Category> findAll() {
        String sql = "SELECT * FROM categories";
        return jdbcTemplate.query(sql, categoryRowMapper);
    }
}
