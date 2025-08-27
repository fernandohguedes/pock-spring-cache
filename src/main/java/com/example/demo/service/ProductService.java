package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Cacheable("produtos")
    public Product getProduct(Long id){
        System.out.println("Buscando do banco de dados...");
        return repository.findById(id).orElse(null);
    }
}
