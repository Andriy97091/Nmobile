package ua.com.nmobile.dto;


import ua.com.nmobile.entity.Category;
import ua.com.nmobile.entity.SubCategory;

import java.util.ArrayList;
import java.util.List;

public class CategoryDTO {
    private List<Category> categories = new ArrayList<Category>();
    private List<SubCategory> subCategories = new ArrayList<SubCategory>();

    public CategoryDTO() {
    }



    public CategoryDTO(List<Category> categories, List<SubCategory> subCategories) {
        this.categories = categories;
        this.subCategories = subCategories;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<SubCategory> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    @Override
    public String toString() {
        return "CategoryDTOServises{" +
                "categories=" + categories +
                ", subCategories=" + subCategories +
                '}';
    }
}
