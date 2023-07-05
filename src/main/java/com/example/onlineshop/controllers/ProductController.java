package com.example.onlineshop.controllers;

import com.example.onlineshop.models.Image;
import com.example.onlineshop.models.Product;
import com.example.onlineshop.repositories.CategoryRepository;
import com.example.onlineshop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @GetMapping("/getAll")
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepository.getProductsById(id);
    }
    @GetMapping("/{id}/getImage")
    public Set<Image> getImg(@PathVariable Long id) {
        return productRepository.getProductsById(id).getImages();
    }
    @GetMapping("/getProductByCategoryId/{id}")
    public Set<Product> getProductByCategoryId(@PathVariable Long id) {
        return categoryRepository.findCategoriesById(id).getProducts();
    }
}
