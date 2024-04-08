package com.siddharth.productsst.Controller;

import com.siddharth.productsst.models.Product;
import com.siddharth.productsst.services.Productservices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private Productservices productService;
    ProductController(Productservices productService) {
        this.productService = productService;
    }
    @GetMapping("/{id}")
    public Product getproductbyid(@PathVariable("id") Long id){
        return productService.getproductbyid(id);
    }
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


}
