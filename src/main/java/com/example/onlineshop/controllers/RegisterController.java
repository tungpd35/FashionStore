package com.example.onlineshop.controllers;

import com.example.onlineshop.models.User;
import com.example.onlineshop.repositories.UserRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class RegisterController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }
    @PostMapping("/register")
    public String registerPagePost(@ModelAttribute User user, Model model) {
        if((userRepository.findUserByUsername(user.getUsername()) != null) && (!user.getUsername().equals(""))) {
            model.addAttribute("mess","Tài Khoản Đã Tồn Tại");
            return "register";
        } else {
            User newUser = new User(user.getUsername(),passwordEncoder.encode(user.getPassword()),"USER");
            userRepository.save(newUser);
            return "redirect:/login";
        }
    }
}
