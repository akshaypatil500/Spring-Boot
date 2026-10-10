package com.tca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tca.model.User;
import jakarta.validation.Valid;

@Controller
public class UserController {

    @GetMapping("/form")
    public String showForm(Model model) {

        model.addAttribute("user", new User());

        return "User";
    }

    @PostMapping("/register")
    public String handlerForm(
            @Valid @ModelAttribute("user") User user,
            BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "User";
        }

        model.addAttribute("a", user.getUsername());
        model.addAttribute("b", user.getEmail());
        model.addAttribute("c", user.getMobile());
        model.addAttribute("d", user.getGender());
        model.addAttribute("e", user.getBdate());


        return "userDetails";
    }
}