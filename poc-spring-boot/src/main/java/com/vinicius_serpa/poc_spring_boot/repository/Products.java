package com.vinicius_serpa.poc_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius_serpa.poc_spring_boot.model.Product;

public interface Products extends JpaRepository<Product, Long> {

}
