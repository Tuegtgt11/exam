package com.example.exam.service;

import com.example.exam.entity.Sale;
import com.example.exam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
    @Autowired
    private SaleRepository productRepository;

    public Iterable<Sale> findAll(){
        return productRepository.findAll();
    }
}
