package com.example.orderservice.entity;

import java.math.BigDecimal;

public class ProductEntity {
    private Long id;
    private String name;
    private String sku;
    private BigDecimal importPrice;
    private BigDecimal sellPrice;
    private Integer stockQuantity;

    public ProductEntity() {
    }

    public ProductEntity(Long id, String name, String sku, BigDecimal importPrice,
                         BigDecimal sellPrice, Integer stockQuantity) {
        this.id = id;
        this.name = name;
        this.sku = sku;
        this.importPrice = importPrice;
        this.sellPrice = sellPrice;
        this.stockQuantity = stockQuantity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSku() {
        return sku;
    }

    public BigDecimal getImportPrice() {
        return importPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }
}
