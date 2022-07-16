package com.example.exam.service;

import com.example.exam.entity.Product;
import com.example.exam.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> findAll(){
        return productRepository.findAll();
    }
}
