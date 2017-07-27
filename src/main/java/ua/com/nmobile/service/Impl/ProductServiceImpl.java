package ua.com.nmobile.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.ProblemReporter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.dao.ProductDAO;
import ua.com.nmobile.entity.Product;
import ua.com.nmobile.service.ProductService;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    public void saveProduct(Product product) {
        productDAO.save(product);
    }

    public Product findOne(int id) {
        return productDAO.findOne(id);
    }

    public List<Product> findAll() {
        return productDAO.findAll();
    }

    public void delete(Product product) {
        productDAO.delete(product);
    }

    public void delete(int id) {
        productDAO.delete(id);
    }

    public List<Product> findAllProductWithSubCategory() {
        return productDAO.findAllProductWithSubCategory();
    }

    public Product findOneProductWithCharacteristics(int id) {
        return productDAO.findOneProductWithCharacteristics(id);
    }

}
