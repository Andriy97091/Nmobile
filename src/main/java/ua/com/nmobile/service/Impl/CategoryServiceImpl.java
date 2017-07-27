package ua.com.nmobile.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.dao.CategoryDAO;
import ua.com.nmobile.dao.SubCategoryDAO;
import ua.com.nmobile.entity.Category;
import ua.com.nmobile.service.CategoryService;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

    public void saveCategory(Category category) {
        categoryDAO.save(category);
    }

    public List<Category> findAll() {
        return categoryDAO.findAll();
    }

    public Category findOne(int id) {
        return categoryDAO.findOne(id);
    }

    public void delete(int id) {
        categoryDAO.delete(id);
    }

    public void delete(Category category) {
        categoryDAO.delete(category);
    }
}
