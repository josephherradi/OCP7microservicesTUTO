package com.ocp7.client.controllers;

import com.ocp7.client.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {
    @Autowired
    UserRepository userRepo;

    @RequestMapping("/users")
    public String home(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "users";
    }
}