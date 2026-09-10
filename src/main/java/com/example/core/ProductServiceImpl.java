package com.example.core;

import com.example.infrastructure.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) throws DuplicateProductNameException, InvalidPriceException {
        if (productRepository.findByName(product.getName()).isPresent()) {
            throw new DuplicateProductNameException("Product name already exists");
        }
        if (product.getPrice() < 0) {
            throw new InvalidPriceException("Price cannot be negative");
        }
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) throws ProductNotFoundException {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @Override
    public Product updateProduct(Long id, Product product) throws ProductNotFoundException, DuplicateProductNameException, InvalidPriceException {
        Product existingProduct = getProductById(id);
        if (!existingProduct.getName().equals(product.getName()) && productRepository.findByName(product.getName()).isPresent()) {
            throw new DuplicateProductNameException("Product name already exists");
        }
        if (product.getPrice() < 0) {
            throw new InvalidPriceException("Price cannot be negative");
        }
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStock(product.getStock());
        existingProduct.setCategory(product.getCategory());
        return productRepository.save(existingProduct);
    }

    @Override
    public void deleteProduct(Long id) throws ProductNotFoundException {
        Product product = getProductById(id);
        productRepository.delete(product);
    }
}