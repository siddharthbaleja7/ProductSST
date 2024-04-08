package com.siddharth.productsst.services;

import com.siddharth.productsst.models.Product;

import java.util.List;

public interface Productservices {
    Product getproductbyid(Long id);
    List<Product> getAllProducts();
}
