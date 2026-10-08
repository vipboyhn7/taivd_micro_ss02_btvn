package com.example.orderservice.dto;

import com.example.orderservice.entity.Order;

import java.math.BigDecimal;

public record OrderResponse(Long id, String customerId, BigDecimal totalAmount) {

    public static OrderResponse from(Order order) {
        return new OrderResponse(order.getId(), order.getCustomerId(), order.getTotalAmount());
    }
}
