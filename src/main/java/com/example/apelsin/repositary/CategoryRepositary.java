package com.example.apelsin.repositary;

import com.example.apelsin.entity.Category;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepositary extends JpaRepository<Category,Integer> {
    List<Category> findAllByActiveTrue(Sort sort);
}
