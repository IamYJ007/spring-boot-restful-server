package com.engine.restful.dao;

import com.engine.restful.models.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> getProducts();

    public List<Product> getProductByIds(List<Integer> productIds);
}
