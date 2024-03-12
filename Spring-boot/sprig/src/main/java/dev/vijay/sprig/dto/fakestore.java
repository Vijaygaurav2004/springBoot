package dev.vijay.sprig.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class fakestore {
    Long id;
    Long userId;
    String date;
    private product[] products;
}