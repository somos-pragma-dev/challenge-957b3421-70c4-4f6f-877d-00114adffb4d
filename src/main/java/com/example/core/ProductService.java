package com.example.core;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product) throws DuplicateProductNameException, InvalidPriceException;
    List<Product> getAllProducts();
    Product getProductById(Long id) throws ProductNotFoundException;
    Product updateProduct(Long id, Product product) throws ProductNotFoundException, DuplicateProductNameException, InvalidPriceException;
    void deleteProduct(Long id) throws ProductNotFoundException;
}