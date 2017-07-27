package ua.com.nmobile.service;

import ua.com.nmobile.entity.Product;

import java.util.List;


public interface ProductService {
    void saveProduct(Product product);
    Product findOne(int id);
    List<Product> findAll();
    void delete(Product product);
    void delete(int id);
    List<Product> findAllProductWithSubCategory();
    Product findOneProductWithCharacteristics(int id);
}
