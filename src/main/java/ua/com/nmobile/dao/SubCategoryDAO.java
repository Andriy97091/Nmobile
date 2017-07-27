package ua.com.nmobile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.nmobile.entity.SubCategory;

import java.util.List;

/**
 * Created by User on 23.07.2017.
 */
public interface SubCategoryDAO extends JpaRepository<SubCategory, Integer> {

}
