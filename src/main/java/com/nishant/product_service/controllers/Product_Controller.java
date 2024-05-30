package com.nishant.product_service.controllers;


import com.nishant.product_service.dtos.FakeStoreDto;
import com.nishant.product_service.dtos.ProductRequestDto;
import com.nishant.product_service.dtos.ProductResponseDto;
import com.nishant.product_service.models.Model;
import com.nishant.product_service.services.ProductService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController

public class Product_Controller {

    private ProductService productservice;

    public Product_Controller(ProductService productservice){
        this.productservice = productservice;
    }

    @GetMapping("/Products/{id}")
    public ProductResponseDto getProductDetails(@PathVariable("id")int product_id){

       return  productservice.getsingleProduct(product_id);

    }

    @PostMapping("/Products")
    public ProductResponseDto createNewProduct(@RequestBody ProductRequestDto product){

        return  productservice.addProduct(product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getImage(),
                product.getCategory()

        );

    }




}
