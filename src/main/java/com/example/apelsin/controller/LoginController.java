package com.example.apelsin.controller;
import com.example.apelsin.entity.Customers;
import com.example.apelsin.repositary.CusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    CusRepository cusRepository;


    @GetMapping
    public String reg(Model model){
        return "index";
    }

    @PostMapping
    public String iseuser(Model model, @RequestParam("usernm") String usernm, @RequestParam("userpsw")String pass){
        List<Customers> javob= cusRepository.findByUsername(usernm);
        if (javob.get(0).getPassword().equals(pass)){
            return "home/home";
        }else {
            return "index";
        }

    }

}
