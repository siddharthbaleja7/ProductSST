package com.siddharth.productsst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreproductDto {
    private String title;
    private double price;
    private Long id;
    private String category;
    private String description;
    private String image;
}
