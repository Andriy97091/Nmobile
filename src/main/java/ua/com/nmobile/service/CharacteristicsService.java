package ua.com.nmobile.service;

import ua.com.nmobile.entity.Characteristics;

import java.util.List;


public interface CharacteristicsService {
    void saveCharacteristics(Characteristics characteristics);
    List<Characteristics> findAllCharacteristics();
}
