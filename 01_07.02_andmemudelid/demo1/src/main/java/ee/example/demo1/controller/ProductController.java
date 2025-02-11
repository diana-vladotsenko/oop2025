package ee.example.demo1.controller;

import ee.example.demo1.entity.Product;
import ee.example.demo1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

public class ProductController {
    @Autowired
    ProductRepository productRepository;
    @GetMapping("product")
    public List <Product> getProducts() {
        return productRepository.findAll();
    }

    @PostMapping("product")
    public List <Product> addProduct(@RequestBody Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }
}

