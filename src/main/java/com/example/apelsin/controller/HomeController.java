package com.example.apelsin.controller;

import com.example.apelsin.repositary.CusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    @Autowired
    CusRepository cusRepository;

    @GetMapping
    public String reg(Model model){
        return "home/home";
    }

}
