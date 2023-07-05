package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Product;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpCookie;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productDetail")
public class ProductDetailController {
    @GetMapping("/{id}")
    public String productDetailPage(@PathVariable Long id) {
        Product product = new Product("Xiaomi Đồng hồ thông minh Redmi Watch 2 Lite","Xiaomi","Màn hình cảm ứng nhiều màu 1,55 inch",1490000,26);

        return "contentDetails";
    }
}
