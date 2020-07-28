package com.example.DatabaseProject.repository;

import com.example.DatabaseProject.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {


    Product findByName(String name);
}
