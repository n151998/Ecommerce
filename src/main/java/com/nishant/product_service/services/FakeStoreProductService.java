package com.nishant.product_service.services;

import com.nishant.product_service.dtos.FakeStoreDto;
import com.nishant.product_service.dtos.ProductResponseDto;
import com.nishant.product_service.models.Model;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService{

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public ProductResponseDto getsingleProduct(int productId) {

        FakeStoreDto fakeStoreDto= restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+productId,FakeStoreDto.class);

        return fakeStoreDto.toProductResponseDto();
    }
    @Override
    public ProductResponseDto addProduct(String name,
                                         String description,
                                         double price,
                                         String Category,
                                         String Image) {

        FakeStoreDto fakeStoreDto= new FakeStoreDto();
        fakeStoreDto.setName(name);
        fakeStoreDto.setDescription(description);
        fakeStoreDto.setPrice(price);
        fakeStoreDto.setCategory(Category);
        fakeStoreDto.setImage(Image);

        FakeStoreDto fakeDto= restTemplate.postForObject("https://fakestoreapi.com/products/",fakeStoreDto,FakeStoreDto.class);

        return fakeDto.toProductResponseDto();

    }
}
