package com.getsdeready.ecommerce.service;

import com.getsdeready.ecommerce.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class OrderService {
    
    private static final Lock lock = new ReentrantLock();

    public Order createOrder(User user) {
        Cart cart = user.getCart();
        Order order = new Order();

        if (lock.tryLock()) {
            lock.lock();
            // start transaction as serialisable
            List<OrderProduct> orderProducts = convertToOrderProducts(cart);

            order.setUser(user);
            order.setOrderProducts(orderProducts);
            order.setOrderStatus(OrderStatus.CREATED);

            // save the order
            // end transaction
            lock.unlock();
        }

        return order;
    }

    private List<OrderProduct> convertToOrderProducts(Cart cart) {
        List<OrderProduct> orderProducts = new ArrayList<>();
        for (CartProduct cartProduct : cart.getCartProducts()) {
            if (cartProduct.getProduct().getInventoryStock()
                    < cartProduct.getQuantity()) {
                throw new RuntimeException("No stock available for " + cartProduct.getProduct());
            }
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setProduct(cartProduct.getProduct());
            orderProduct.setOrderPrice(cartProduct.getProduct().getSellingPrice());
            orderProduct.setQuantity(cartProduct.getQuantity());
            orderProducts.add(orderProduct);

        }


//        return cart.getCartProducts().stream()
//                .map(cartProduct -> {
//            OrderProduct orderProduct = new OrderProduct();
//            orderProduct.setProduct(cartProduct.getProduct());
//            orderProduct.setOrderPrice(cartProduct.getProduct().getSellingPrice());
//            orderProduct.setQuantity(cartProduct.getQuantity());
//            return orderProduct;
//        }).collect(Collectors.toList());

        return orderProducts;
    }
}
