package com.demo.productservice.controllers;

import com.demo.productservice.models.Product;
import com.demo.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public String postProduct(@RequestBody Product product){
        productService.saveProduct(product);
        return "saved";
    }
    @GetMapping("/products/{category}")
    public List<Product> findProductsByCategory(@PathVariable String category){
        return productService.findByCategory(category);
    }

    @GetMapping("/products/{category}/{sub_category}")
    public List<Product> findProductsByCategoryAndSubCategory(@PathVariable String category,@PathVariable String sub_category){
        return productService.findByCategoryAndSubCategory(category,sub_category);
    }

    @GetMapping("/products/{id}")
    public boolean updateProductCount(@PathVariable Long id){
        return productService.updateProductCount(id);
    }


}
