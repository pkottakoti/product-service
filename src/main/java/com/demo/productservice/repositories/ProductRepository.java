package com.demo.productservice.repositories;

import com.demo.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product findProductByCategoryAndSubCategory(String category,String subCategory);
    Product findProductByCategory()

}
