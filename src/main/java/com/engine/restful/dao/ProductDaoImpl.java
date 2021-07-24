package com.engine.restful.dao;

import com.engine.restful.models.Product;
import com.engine.restful.util.Utility;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Override
    public List<Product> getProducts() {
        Map<Integer, Product> productMap = Utility.getAllProducts();
        return new ArrayList<>(productMap.values());
    }

    @Override
    public List<Product> getProductByIds(List<Integer> productIds) {
        Map<Integer, Product> productMap = Utility.getAllProducts();
        return productIds.stream().map(productMap::get).collect(Collectors.toList());
    }
}
