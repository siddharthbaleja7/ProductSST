package com.siddharth.productsst.services;

import com.siddharth.productsst.dtos.FakeStoreproductDto;
import com.siddharth.productsst.models.Category;
import com.siddharth.productsst.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements Productservices{
    String url = "https://fakestoreapi.com";

    public Product getproductbyid(Long id){
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreproductDto fakedto = restTemplate.getForObject(url + "/products/" + id, FakeStoreproductDto.class);
        return convertFakeStoreProductDtoToProduct(fakedto);
    }

    public List<Product> getAllProducts(){
        RestTemplate restTemplate = new RestTemplate();
        FakeStoreproductDto[] fakeStoreproductdto = restTemplate.getForObject(url + "/products", FakeStoreproductDto[].class);
        List<Product> product = new ArrayList<>();
        for(FakeStoreproductDto fakeStoreproduct : fakeStoreproductdto){
            product.add(convertFakeStoreProductDtoToProduct(fakeStoreproduct));
        }
        return product;
    }
    private Product convertFakeStoreProductDtoToProduct(FakeStoreproductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        Category category = new Category();
        category.setDescription(fakeStoreProductDto.getCategory());
        product.setCategory(category);

        return product;
    }

}
