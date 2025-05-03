package com.example.whatsapp.service;

import com.example.whatsapp.model.User;
import com.example.whatsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {

    private final Set<Long> connectedUsers = ConcurrentHashMap.newKeySet();

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String name, String phone) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);

        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isPresent()) {
            return user.get();
        }

        throw new RuntimeException("User Not Found");
    }

    public void login(Long userId) {
        connectedUsers.add(userId);
    }

    public void logout(Long userId) {
        connectedUsers.remove(userId);
    }

    public boolean isConnected(Long userId) {
        return connectedUsers.contains(userId);
    }
}
