package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Cart;
import com.example.onlineshop.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CartController {
    @Autowired
    private CartRepository cartRepository;
    @GetMapping("/api/cart/{id}")
    public Cart getCartById(@PathVariable Long id) {
        return cartRepository.getCartById(id);
    }
}
