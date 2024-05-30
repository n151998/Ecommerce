package com.nishant.product_service.services;

import com.nishant.product_service.dtos.FakeStoreDto;
import com.nishant.product_service.dtos.ProductResponseDto;
import com.nishant.product_service.models.Model;
import org.springframework.stereotype.Service;


public interface ProductService {

    public ProductResponseDto getsingleProduct(int productId);

    public ProductResponseDto addProduct(String name,
                                         String description,
                                         double price,
                                         String Category,
                                         String ImageUrl);
}
