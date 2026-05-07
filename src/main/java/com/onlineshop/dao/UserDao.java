package com.onlineshop.dao;

import com.onlineshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<User> userRowMapper = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getInt("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setRole(rs.getString("role"));
            user.setFullName(rs.getString("full_name"));
            user.setAddress(rs.getString("address"));
            user.setPhone(rs.getString("phone"));
            user.setCreatedAt(rs.getTimestamp("created_at"));
            return user;
        }
    };

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        List<User> users = jdbcTemplate.query(sql, userRowMapper, username);
        return users.isEmpty() ? null : users.get(0);
    }

    public void save(User user) {
        String sql = "INSERT INTO users (username, password, email, role, full_name, address, phone) VALUES (?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), user.getRole(), user.getFullName(), user.getAddress(), user.getPhone());
    }
}
