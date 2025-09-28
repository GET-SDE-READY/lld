package com.getsdeready.ecommerce.model;

import java.util.List;

public class Product {
    private Long id;
    private String name;
    private String msku; // Merchant Stock Keeping Unit
    private Integer inventoryStock;
    private Double markingPrice;
    private Double sellingPrice;
    private List<Review> reviews;
    private User seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsku() {
        return msku;
    }

    public void setMsku(String msku) {
        this.msku = msku;
    }

    public Integer getInventoryStock() {
        return inventoryStock;
    }

    public void setInventoryStock(Integer inventoryStock) {
        this.inventoryStock = inventoryStock;
    }

    public Double getMarkingPrice() {
        return markingPrice;
    }

    public void setMarkingPrice(Double markingPrice) {
        this.markingPrice = markingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
