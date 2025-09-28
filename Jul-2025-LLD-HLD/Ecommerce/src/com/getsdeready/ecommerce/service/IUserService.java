package com.getsdeready.ecommerce.service;

import com.getsdeready.ecommerce.model.User;

/**
 * Normal CRUD operations
 */
public interface IUserService {

    User createUser(User user);
    User getUser(String id);
    User updateUser(User user);
    void deactivateUser(String id);
}
