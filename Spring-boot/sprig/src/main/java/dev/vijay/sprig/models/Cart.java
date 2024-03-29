package dev.vijay.sprig.models;

import dev.vijay.sprig.dto.product;

public class Cart {
    long id;
    long userId;
    String date;

    product[] products;

    public Cart(long id, long userId, String date, product[] products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public product[] getProducts() {
        return products;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }
}
