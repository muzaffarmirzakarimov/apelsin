package com.example.apelsin.service;


import com.example.apelsin.dto.ApiResponse;
import com.example.apelsin.entity.Category;
import com.example.apelsin.repositary.CategoryRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepositary categoryRepositary;

    public ApiResponse edit(Integer id, Category category) {
        Optional<Category> byId = categoryRepositary.findById(id);
        Category category1 = byId.get();

        category1.setName(category.getName());
        category1.setActive(category.isActive());

        categoryRepositary.save(category1);
        return new ApiResponse("Saved",true);
    }
}
