package com.engine.restful.controller;

import com.engine.restful.models.Product;
import com.engine.restful.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = {"api/product"})
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> getProducts() {
        log.info("Fetching products");
        List<Product> products = productService.getProducts();
        if (products == null && products.isEmpty()) {
            return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
    }

    @PostMapping(value = "/ids", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Product>> createUser(@RequestBody List<Integer> productIds) {

        List<Product> productList = productService.getProductByIds(productIds);
        if (productList == null && productList.isEmpty()) {
            return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }
}
