package com.engine.restful.service;

import com.engine.restful.dao.ProductDao;
import com.engine.restful.exception.InvalidProductIdException;
import com.engine.restful.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @Override
    public List<Product> getProductByIds(List<Integer> productIds) {
        for (Integer e : productIds) {
            if (e == 0) {
                throw new InvalidProductIdException("The given product id is invalid");
            }
        }
        return productDao.getProductByIds(productIds);
    }
}
