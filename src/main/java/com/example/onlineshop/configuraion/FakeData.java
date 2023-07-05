package com.example.onlineshop.configuraion;

import com.example.onlineshop.models.Category;
import com.example.onlineshop.models.Image;
import com.example.onlineshop.models.Product;
import com.example.onlineshop.models.User;
import com.example.onlineshop.repositories.CategoryRepository;
import com.example.onlineshop.repositories.ProductRepository;
import com.example.onlineshop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class FakeData {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    public UserRepository userRepository;
    @Autowired
    public PasswordEncoder passwordEncoder;
    @Bean
    public void CreatData() {
//        Image image1 = new Image("https://down-vn.img.susercontent.com/file/ad76dd2a630e128d8ca3fa1b0d23437e");
//        Image image2 = new Image("https://down-vn.img.susercontent.com/file/7bac8208e3c234f21d3a8a539a55a1df");
//        Image image3 = new Image("https://down-vn.img.susercontent.com/file/2878bc7807ed9a4712c4113d91d99779");
//        Image image4 = new Image("https://down-vn.img.susercontent.com/file/7eb932f4e5a2e0d299d7f93e4e999360");
//        Image image5 = new Image("https://down-vn.img.susercontent.com/file/3d9bc0283eb313ffbfdbdaa060e7360e");
//        Set<Image> images = new HashSet<>();
//        images.add(image1);
//        images.add(image2);
//        images.add(image3);
//        images.add(image4);
//        images.add(image5);
//        Category category = categoryRepository.findCategoriesByName("Phụ Kiện");
//        Set<Category> categories = new HashSet<>();
//        categories.add(category);
//        Product product1 = new Product("Xiaomi Đồng hồ thông minh Redmi Watch 2 Lite","Xiaomi","Màn hình cảm ứng nhiều màu 1,55 inch",1490000,26,images,categories);
//        System.out.println(product1);
//        image1.setProduct(product1);
//        image2.setProduct(product1);
//        image3.setProduct(product1);
//        image4.setProduct(product1);
//        productRepository.save(product1);

    }
}
