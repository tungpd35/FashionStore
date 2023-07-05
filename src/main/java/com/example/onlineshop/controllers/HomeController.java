package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Product;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping
    public String homePage(HttpSession session) {
        return "index";
    }
    @PostMapping
    public String homePagePost() {
        return "index";
    }
}
