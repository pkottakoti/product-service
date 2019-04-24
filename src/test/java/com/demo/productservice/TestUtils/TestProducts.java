package com.demo.productservice.TestUtils;

import com.demo.productservice.models.Product;


import java.util.ArrayList;
import java.util.List;

public class TestProducts {
    public static List<Product> getSongs(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Men", "Shirts", 10.00, "M", 10));
        products.add(new Product("Men", "Pants", 11.00, "L", 15));
        products.add(new Product("Women", "Tops", 15.99, "S", 6));
        products.add(new Product("Women", "Dresses", 30.00, "M", 4));
        products.add(new Product("Girls", "Tops", 25.00, "S", 3));
        products.add(new Product("Girls", "Pants", 17.00, "XL", 12));
        products.add(new Product("Boys", "Shirts", 19.00, "S", 16));
        products.add(new Product("Boys", "Pants", 4.50, "M", 10));
        return products;
    }
}
