package com.example.orderservice.dto;

import com.example.orderservice.entity.ProductEntity;

import java.math.BigDecimal;

public record ProductResponseDTO(Long id, String name, BigDecimal sellPrice) {

    public static ProductResponseDTO from(ProductEntity product) {
        return new ProductResponseDTO(product.getId(), product.getName(), product.getSellPrice());
    }
}
