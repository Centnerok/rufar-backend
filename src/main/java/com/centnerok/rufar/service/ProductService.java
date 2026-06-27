package com.centnerok.rufar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.centnerok.rufar.model.dto.ProductDto;
import com.centnerok.rufar.model.entity.Product;

@Service
public interface ProductService {
    // Get all or matching the filter products
    List<Product> getProducts();

    // Create new product and post him to the DB
    ProductDto createProduct(ProductDto productDto);

    // Update product and put update to the DB
    ProductDto updateProduct(Long id, ProductDto productDto);

    // Delete product with id from DB
    void deleteProduct(Long id);

    // Find product by id and map to ProductDto
    ProductDto findProductById(Long id);

    // Find product by user_id and map to ProductDto
    List<ProductDto> findProductsByUserId(Long userId);
}
