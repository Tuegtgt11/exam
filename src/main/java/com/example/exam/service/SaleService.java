package com.example.exam.service;

import com.example.exam.entity.Sale;
import com.example.exam.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    SaleRepository saleRepository;

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }
}

