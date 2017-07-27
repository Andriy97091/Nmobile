package ua.com.nmobile.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.dao.CharacteristicsDAO;
import ua.com.nmobile.entity.Characteristics;
import ua.com.nmobile.service.CharacteristicsService;

import java.util.List;

@Service
@Transactional
public class CharacteristicsServiceImpl implements CharacteristicsService {
    @Autowired
    private CharacteristicsDAO characteristicsDAO;

    public void saveCharacteristics(Characteristics characteristics) {
        characteristicsDAO.save(characteristics);
    }

    public List<Characteristics> findAllCharacteristics() {
        return characteristicsDAO.findAll();
    }
}
