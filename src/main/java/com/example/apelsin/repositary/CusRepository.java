package com.example.apelsin.repositary;


import com.example.apelsin.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CusRepository extends JpaRepository<Customers,Integer> {

     List<Customers> findByUsername(String username);

}
