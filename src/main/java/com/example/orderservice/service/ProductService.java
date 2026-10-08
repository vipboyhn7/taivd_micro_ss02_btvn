package com.example.orderservice.service;

import com.example.orderservice.dto.ProductResponseDTO;
import com.example.orderservice.exception.ProductNotFoundException;
import com.example.orderservice.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductResponseDTO getById(Long id) {
        return productRepository.findById(id)
                .map(ProductResponseDTO::from)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }
}
