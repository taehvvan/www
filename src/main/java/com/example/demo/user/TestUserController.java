package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class TestUserController {

    @Autowired
    private TestUserRepository repository;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new TestUser());
        return "form"; // form.html 또는 form.jsp
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute TestUser user) {
        repository.save(user);
        return "redirect:/users";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        model.addAttribute("users", repository.findAll());
        return "userlist"; // userlist.html 또는 userlist.jsp
    }
}
