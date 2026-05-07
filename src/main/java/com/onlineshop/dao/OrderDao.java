package com.onlineshop.dao;

import com.onlineshop.model.Order;
import com.onlineshop.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Repository
public class OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveOrder(Order order) {
        String sql = "INSERT INTO orders (user_id, total_amount, status, shipping_address) VALUES (?, ?, ?, ?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, order.getUserId());
            ps.setDouble(2, order.getTotalAmount());
            ps.setString(3, order.getStatus());
            ps.setString(4, order.getShippingAddress());
            return ps;
        }, keyHolder);

        return keyHolder.getKey().intValue();
    }

    public void saveOrderItem(OrderItem item) {
        String sql = "INSERT INTO order_items (order_id, product_id, quantity, price) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, item.getOrderId(), item.getProductId(), item.getQuantity(), item.getPrice());
    }

    private final RowMapper<Order> orderRowMapper = new RowMapper<Order>() {
        @Override
        public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
            Order order = new Order();
            order.setId(rs.getInt("id"));
            order.setUserId(rs.getInt("user_id"));
            order.setTotalAmount(rs.getDouble("total_amount"));
            order.setStatus(rs.getString("status"));
            order.setShippingAddress(rs.getString("shipping_address"));
            order.setCreatedAt(rs.getTimestamp("created_at"));
            return order;
        }
    };

    public List<Order> findByUserId(int userId) {
        String sql = "SELECT * FROM orders WHERE user_id = ? ORDER BY created_at DESC";
        return jdbcTemplate.query(sql, orderRowMapper, userId);
    }
}
