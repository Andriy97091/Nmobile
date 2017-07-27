package ua.com.nmobile.service;

import ua.com.nmobile.entity.Category;

import java.util.List;


public interface CategoryService {
    void saveCategory(Category category);
    List<Category> findAll();
    Category findOne(int id);
    void delete(int id);
    void delete(Category category);
}
