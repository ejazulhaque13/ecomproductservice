package com.scaler.ecomproductservice.controller;

import com.scaler.ecomproductservice.dto.ProductListResponseDTO;
import com.scaler.ecomproductservice.dto.ProductResponseDTO;
import com.scaler.ecomproductservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class ProductController {
        @Autowired
        @Qualifier("fakeStoreProductService")
        private ProductService productService;

        @GetMapping("/products")
public ResponseEntity getAllProducts(){
        /*ProductResponseDTO p1 = new ProductResponseDTO();
        p1.setId(1);
        p1.setTitle("Iphone 15 pro");
        p1.setPrice(150000);
        p1.setImage("www.google.com/images/iphone");
        p1.setDescription("Kafi mehenga phone");
        p1.setCategory("Electronics");

        ProductResponseDTO p2 = new ProductResponseDTO();
        p2.setId(2);
        p2.setTitle("Macbook pro");
        p2.setPrice(250000);
        p2.setImage("www.google.com/images/Macbook");
        p2.setDescription("Kafi mehenga laptop");
        p2.setCategory("Electronics");

        List<ProductResponseDTO> products = Arrays.asList(p1, p2);
        return ResponseEntity.ok(products);
        */
            ProductListResponseDTO response = productService.getAllProducts();
            return ResponseEntity.ok(response);
    }
    @GetMapping("/products/1")
    public ResponseEntity getProductFromId(){
        /*ProductResponseDTO p1 = new ProductResponseDTO();
        p1.setId(1);
        p1.setTitle("Iphone 15 pro");
        p1.setPrice(150000);
        p1.setImage("www.google.com/images/iphone");
        p1.setDescription("Kafi mehenga phone");
        p1.setCategory("Electronics");

        ProductResponseDTO p2 = new ProductResponseDTO();
        p2.setId(2);
        p2.setTitle("Macbook pro");
        p2.setPrice(250000);
        p2.setImage("www.google.com/images/Macbook");
        p2.setDescription("Kafi mehenga laptop");
        p2.setCategory("Electronics");

        List<ProductResponseDTO> products = Arrays.asList(p1, p2);
        return ResponseEntity.ok(products);
        */
        ProductResponseDTO response = productService.getProductbyId(1);
        return ResponseEntity.ok(response);
    }
}
