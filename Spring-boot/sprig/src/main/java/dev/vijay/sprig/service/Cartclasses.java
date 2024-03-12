package dev.vijay.sprig.service;

import dev.vijay.sprig.models.Cart;

import java.util.List;

public interface Cartclasses {
    List<Cart> inDateRange(String start, String end);
}
