package com.daniel.falcon.ProductService.service;


import com.daniel.falcon.ProductService.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);


}
