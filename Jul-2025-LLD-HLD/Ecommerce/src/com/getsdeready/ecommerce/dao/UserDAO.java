package com.getsdeready.ecommerce.dao;

import com.getsdeready.ecommerce.model.Address;
import com.getsdeready.ecommerce.model.Cart;
import com.getsdeready.ecommerce.model.Order;
import com.getsdeready.ecommerce.model.UserType;

import java.util.List;

/**
 * DAO should be created when there is some extra/sensitive
 * information in the database that we do not want to expose to
 * other services/outside world
 * For example - hashedPassword
 */
public class UserDAO {
    private Long id;
    private String name;
    private String email;
    private String hashedPassword;
    private List<Address> savedAddresses;
    private String phoneNumber;
    private UserType userType;
    private Cart cart;
    private List<Order> orderHistory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Address> getSavedAddresses() {
        return savedAddresses;
    }

    public void setSavedAddresses(List<Address> savedAddresses) {
        this.savedAddresses = savedAddresses;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
