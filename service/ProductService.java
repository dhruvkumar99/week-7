package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.model.entity.Product;
import com.ecommerce.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product save(Product p) {
        return repo.save(p);
    }
}