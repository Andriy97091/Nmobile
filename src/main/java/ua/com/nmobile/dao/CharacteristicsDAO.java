package ua.com.nmobile.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.nmobile.entity.Characteristics;

/**
 * Created by User on 23.07.2017.
 */
public interface CharacteristicsDAO extends JpaRepository<Characteristics,Integer> {
}
