package com.example.orderservice.repository;

import com.example.orderservice.entity.ProductEntity;

import java.util.Optional;

public interface ProductRepository {
    Optional<ProductEntity> findById(Long id);
}
