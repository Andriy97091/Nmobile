package ua.com.nmobile.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.dao.CharacteristicsDAO;
import ua.com.nmobile.dao.SubCategoryDAO;
import ua.com.nmobile.entity.SubCategory;
import ua.com.nmobile.service.SubCategoryService;

import java.util.List;

@Service
@Transactional
public class SubCategoryServiceImpl implements SubCategoryService {
    @Autowired
    private SubCategoryDAO subCategoryDAO;


    public void saveSubCategory(SubCategory subCategory) {
        subCategoryDAO.save(subCategory);
    }

    public List<SubCategory> findAll() {
        return subCategoryDAO.findAll();
    }

    public SubCategory findOne(int id) {
        return subCategoryDAO.findOne(id);
    }

    public void delete(int id) {
        subCategoryDAO.delete(id);

    }

    public void delete(SubCategory subCategory) {
        subCategoryDAO.delete(subCategory);
    }
}
