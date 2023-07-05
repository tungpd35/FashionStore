package com.example.onlineshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartPageController {
    @GetMapping("/cart")
    public String cartPage() {
        return "cart";
    }
}
