package com.siddharth.productsst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsstApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsstApplication.class, args);
        Product product = new Product();
    }

}
