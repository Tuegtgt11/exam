package com.example.exam.api;


import java.util.List;
import com.example.exam.entity.Sale;
import com.example.exam.repository.SaleRepository;
import com.example.exam.service.ProductService;
import com.example.exam.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
@RequestMapping(path = "api/v1/sales")
public class SaleApi {
    @Autowired
    SaleService saleService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Sale> findAll(){
        return saleService.findAll();
    }
}
