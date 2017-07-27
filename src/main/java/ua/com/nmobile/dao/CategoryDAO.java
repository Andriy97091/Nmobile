package ua.com.nmobile.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.nmobile.entity.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {
}
