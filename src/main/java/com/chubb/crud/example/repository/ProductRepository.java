package com.chubb.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chubb.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}

