package com.example.orderservice.repository;

import com.example.orderservice.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryProductRepository implements ProductRepository {
    private final Map<Long, ProductEntity> products = Map.of(
            1L, new ProductEntity(1L, "Mechanical Keyboard", "KB-001",
                    new BigDecimal("1200000"), new BigDecimal("1590000"), 25)
    );

    @Override
    public Optional<ProductEntity> findById(Long id) {
        return Optional.ofNullable(products.get(id));
    }
}
