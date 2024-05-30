package com.nishant.product_service.models;

import lombok.Getter;
import lombok.Setter;

public class Model {

    @Getter
    @Setter

    private int id;
    private String name;
    private String description;
    private double price;
    private String imageurl;
    private Category  category;
}
