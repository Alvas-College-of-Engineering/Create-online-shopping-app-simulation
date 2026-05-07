package com.onlineshop.service;

import com.onlineshop.dao.OrderDao;
import com.onlineshop.model.Cart;
import com.onlineshop.model.CartItem;
import com.onlineshop.model.Order;
import com.onlineshop.model.OrderItem;
import com.onlineshop.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public Order placeOrder(User user, Cart cart, String shippingAddress) {
        Order order = new Order();
        order.setUserId(user.getId());
        order.setTotalAmount(cart.getTotalAmount());
        order.setStatus("CONFIRMED");
        order.setShippingAddress(shippingAddress);

        int orderId = orderDao.saveOrder(order);
        order.setId(orderId);

        for (CartItem item : cart.getItems()) {
            OrderItem orderItem = new OrderItem(orderId, item.getProductId(), item.getQuantity(), item.getProduct().getPrice());
            orderDao.saveOrderItem(orderItem);
        }

        return order;
    }

    public List<Order> getUserOrders(int userId) {
        return orderDao.findByUserId(userId);
    }
}
