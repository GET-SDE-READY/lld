package com.getsdeready.ecommerce.service;

import com.getsdeready.ecommerce.model.User;

public class UserServiceImpl implements IUserService {
    @Override
    public User createUser(User user) {
        // validate user details
        // convert User to UserDAO
        // call repository to save User
        // return saved user
        return null;
    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deactivateUser(String id) {

    }
}
