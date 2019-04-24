package com.demo.productservice.repositories;

import com.demo.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {


    @Query(value = "SELECT * FROM product p WHERE p.category = :category and p.sub_category = :sub_category")
    List<Product> findByCategoryAndSubCategory(
            @Param("category") String category, @Param("sub_category") String sub_category);

    List<Product> findByCategory(String category);

    @Modifying
    @Query("update Product p set p.count = :p.count-1 where p.id = :id")
    boolean updateProductCount(@Param("id") Long id);


}
