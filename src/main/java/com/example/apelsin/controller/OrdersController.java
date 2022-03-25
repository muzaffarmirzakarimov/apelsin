package com.example.apelsin.controller;

import com.example.apelsin.entity.Category;
import com.example.apelsin.repositary.CategoryRepositary;
import com.example.apelsin.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class OrdersController {
    @Autowired
    CategoryRepositary categoryRepositary;

    @Autowired
    CategoryService categoryService;


    @GetMapping
    public String getAll(Model model){
        model.addAttribute("list",categoryRepositary.findAllByActiveTrue(Sort.by(Sort.Direction.ASC, "id")));
        return "category/category";
    }


    @GetMapping("/add")
    public String getAddPage(){
        return "category/category-add";
    }

    @PostMapping("/add")
    public String save(Model model, @ModelAttribute Category category){
        categoryRepositary.save(category);
        return "redirect:/category";
    }

//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Integer id){
//        Optional<Warehouse> byId = warehouseRepository.findById(id);
//        Warehouse warehouse = byId.get();
//        warehouse.setActive(false);
//        warehouseRepository.save(warehouse);
//        return "redirect:/warehouse";
//    }

//    @GetMapping("/edit/{id}")
//    public String editPage(@PathVariable Integer id, Model model) {
//        Optional<Warehouse> optionalWarehouse = warehouseRepository.findById(id);
//        if (!optionalWarehouse.isPresent()) return "Xatolik!";
//        model.addAttribute("warehouse", optionalWarehouse.get());
//
//        return "warehouse/warehouse-edit";
//    }

//    @PostMapping("/edit/{id}")
//    public String edit(@PathVariable Integer id,@ModelAttribute Warehouse warehouse){
//        ApiResponse response=warehouseService.edit(id,warehouse);
//
//        return "redirect:/warehouse";
//    }

}
