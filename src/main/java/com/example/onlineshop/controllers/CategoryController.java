package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Category;
import com.example.onlineshop.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("api/category")
@CrossOrigin
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/getAll")
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
}
