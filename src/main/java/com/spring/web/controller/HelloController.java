package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String home() {
        return "index";
    }

    @PostMapping
    public String helloForm(@RequestParam("name") String name, Model model){
        model.addAttribute("user", name);
        return "response";
    }
}
