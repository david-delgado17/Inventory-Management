package com.example.springboot.service;

import com.example.springboot.domain.Product;

import java.util.List;


public interface ProductService {
    public List<Product> findAll();
    public Product findById(int theId);
    public void save (Product theProduct);
    public void deleteById(int theId);
    public List<Product> listAll(String keyword);

}
