package ua.com.nmobile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.nmobile.entity.Product;

import java.util.List;

/**
 * Created by User on 23.07.2017.
 */
public interface ProductDAO extends JpaRepository<Product,Integer> {
    @Query(" from Product p join fetch p.subCategory ")
    List<Product> findAllProductWithSubCategory();

    @Query("from Product p join fetch p.characteristics where p.id=:prodId")
    Product findOneProductWithCharacteristics(@Param("prodId") int id);
}
