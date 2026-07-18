package com.centnerok.rufar.mapper;

import org.springframework.stereotype.Component;

import com.centnerok.rufar.model.dto.ProductDto;
import com.centnerok.rufar.model.entity.Product;

@Component
public class ProductMapper {
    public ProductDto mapToDto (Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setUserId(product.getUserId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPhotoPath(product.getPhotoPath());
        productDto.setPrice(product.getPrice());
        productDto.setCity(product.getCity());

        return productDto;
    }

    public Product mapToProduct (ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setUserId(productDto.getUserId());
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPhotoPath(productDto.getPhotoPath());
        product.setPrice(productDto.getPrice());
        product.setCity(productDto.getCity());

        return product;
    }
}
