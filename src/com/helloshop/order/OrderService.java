package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

import javax.swing.border.Border;

public class OrderService {

    public void order() {
        User user = new User();
        Product product = new Product();
        Order order = new Order(user, product);
    }
}
