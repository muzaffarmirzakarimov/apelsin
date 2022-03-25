package com.example.apelsin.controller;


import com.example.apelsin.entity.Customers;
import com.example.apelsin.repositary.CusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {
    static int count=0;


    @Autowired
    CusRepository cusRepository;


    @GetMapping
    public String reg(Model model){
        return "register/register";
    }

    @PostMapping
    public String save(Model model ,@RequestParam("username")String username,@RequestParam("psw")String pass){
        Customers users1 = new Customers();
        users1.setUsername(username);
        users1.setPassword(pass);
        cusRepository.save(users1);
        return "index";
    }


}
