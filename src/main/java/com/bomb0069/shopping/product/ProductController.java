package com.bomb0069.shopping.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/api/v1/product")
    public ProductListResponse getAllProduct() {
        ProductListResponse productListResponse = new ProductListResponse();
        Iterable<Product> allProducts = productRepository.findAll();
        for (Product product : allProducts) {
            productListResponse.addProduct(createProductResponse(product));
        }
        return productListResponse;
    }

    @GetMapping("/api/v1/product/{id}")
    public ProductResponse getProductById(@PathVariable Integer id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        //if (optionalProduct.isEmpty())
            //throw new ProductNotFoundException(id);

        return createProductResponse(optionalProduct.get());
    }

    private ProductResponse createProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getProductName(), product.getProductPrice(), product.getImageUrl());
    }
}
