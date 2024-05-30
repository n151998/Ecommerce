package com.nishant.product_service.dtos;

import com.nishant.product_service.models.Category;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {



    private int id;
    private String name;
    private String description;
    private double price;
    private String image;
    private String category;

    public ProductResponseDto toProductResponseDto(){

        ProductResponseDto productResponseDto= new ProductResponseDto();
        productResponseDto.setId(id);
        productResponseDto.setName(name);
        productResponseDto.setDescription(description);
        productResponseDto.setPrice(price);
        productResponseDto.setImage(image);
        productResponseDto.setCategory(category);

        return productResponseDto;




    }

}
