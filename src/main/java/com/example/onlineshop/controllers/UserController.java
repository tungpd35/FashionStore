package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Cart;
import com.example.onlineshop.models.User;
import com.example.onlineshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.getUserById(id);
    }
    @GetMapping("/getCart/{id}")
    public Set<Cart> getCartByUser(@PathVariable Long id) {
        return userRepository.getUserById(id).getCarts();
    }
}
