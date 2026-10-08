package com.example.orderservice.repository;

import com.example.orderservice.entity.Order;

import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(Long id);

    Order save(Order order);
}
