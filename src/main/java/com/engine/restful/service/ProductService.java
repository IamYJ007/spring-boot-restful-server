package com.engine.restful.service;

import com.engine.restful.models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    public List<Product> getProductByIds(List<Integer> productIds);
}
