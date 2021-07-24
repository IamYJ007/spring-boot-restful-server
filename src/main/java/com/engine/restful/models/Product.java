package com.engine.restful.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    Integer productId;
    String name;
    String category;
    Double price;
    String color;
    String engineType;

}
