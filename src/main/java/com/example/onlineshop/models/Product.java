package com.example.onlineshop.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String brand;
    @Column(length = 1000)
    private String Description;
    private int price;
    private int stock;

    public Product(String name, String brand, String description, int price, int stock, Set<Image> images, Set<Category> categories) {
        this.name = name;
        this.brand = brand;
        Description = description;
        this.price = price;
        this.stock = stock;
        this.images = images;
        this.categories = categories;
    }

    public Product(String name, String brand, String description, int price, int stock) {
        this.name = name;
        this.brand = brand;
        Description = description;
        this.price = price;
        this.stock = stock;
    }

    @OneToMany(mappedBy = "product",cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Image> images;
    @ManyToMany
    @JsonManagedReference
    private Set<Category> categories;
}
