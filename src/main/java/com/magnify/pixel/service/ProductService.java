package com.magnify.pixel.service;

import com.magnify.pixel.model.Product;
import com.magnify.pixel.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(int id) {
//Since this returns an optional we have to handle when its null
        return repo.findById(id).orElse(null);
    }
}
