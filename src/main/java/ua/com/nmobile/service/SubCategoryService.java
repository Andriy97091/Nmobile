package ua.com.nmobile.service;

import ua.com.nmobile.entity.SubCategory;

import java.util.List;


public interface SubCategoryService {
    void saveSubCategory(SubCategory subCategory);
    List<SubCategory> findAll();
    SubCategory findOne(int id);
    void delete(int id);
    void delete(SubCategory subCategory);
}
