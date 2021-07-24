package com.engine.restful.util;

import com.engine.restful.models.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utility {

    public static Map<Integer, Product> getAllProducts() {

        Product product1 = new Product(1, "verna", "sedan", 1800000.00, "silver", "petrol");
        Product product2 = new Product(2, "xuv", "suv", 2100000.00, "red", "diesel");
        Product product3 = new Product(3, "xcent", "sedan", 1700000.00, "blue", "petrol");
        Product product4 = new Product(4, "skoda", "suv", 2500000.00, "white", "diesel");
        Product product5 = new Product(5, "ecosport", "sedan", 4000000.00, "black", "diesel");
        Product product6 = new Product(6, "i20", "hatchback", 6000000.00, "black", "petrol");
        Product product7 = new Product(7, "freestyle", "suv", 9000000.00, "black", "petrol");
        Product product8 = new Product(8, "tiago", "sedan", 7000000.00, "black", "diesel");
        Product product9 = new Product(9, "Benz", "sedan", 5000000.00, "blue", "petrol");
        Product product10 = new Product(10, "Audi", "sedan", 4000000.00, "black", "petrol");
        Product product11 = new Product(11, "BMW", "sedan", 1000000.00, "silver", "diesel");

        Map<Integer, Product> productMap = new HashMap<>();
        productMap.put(product1.getProductId(),product1);
        productMap.put(product2.getProductId(),product2);
        productMap.put(product3.getProductId(),product3);
        productMap.put(product4.getProductId(),product4);
        productMap.put(product5.getProductId(),product5);
        productMap.put(product6.getProductId(),product6);
        productMap.put(product7.getProductId(),product7);
        productMap.put(product8.getProductId(),product8);
        productMap.put(product9.getProductId(),product9);
        productMap.put(product10.getProductId(),product10);
        productMap.put(product11.getProductId(),product11);

        return productMap;
    }


}
