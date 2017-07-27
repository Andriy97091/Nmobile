package ua.com.nmobile.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.dao.CategoryDAO;
import ua.com.nmobile.dao.SubCategoryDAO;
import ua.com.nmobile.dto.CategoryDTO;
import ua.com.nmobile.entity.Category;
import ua.com.nmobile.entity.SubCategory;
import ua.com.nmobile.service.CategoryDTOService;

import java.util.List;

/**
 * Created by User on 23.07.2017.
 */
@Service
@Transactional
public class CategoryDTOServiceImpl implements CategoryDTOService{
    @Autowired
    private CategoryDAO categoryDAO;
    @Autowired
    private SubCategoryDAO subCategoryDAO;

    public CategoryDTO showAll() {
        List<Category> categories = categoryDAO.findAll();
        List<SubCategory> subCategories = subCategoryDAO.findAll();
        CategoryDTO dtos = new CategoryDTO(categories, subCategories);
        return dtos;
    }
}
