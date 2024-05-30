package com.nishant.product_service.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductRequestDto {

    private int id;
    private String name;
    private String description;
    private double price;
    private String image;
    private String category;

}
