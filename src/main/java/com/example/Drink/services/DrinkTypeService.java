package com.example.Drink.services;

import com.example.Drink.models.entities.DrinkType;
import com.example.Drink.repositories.DrinkTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DrinkTypeService {
    @Autowired
    private DrinkTypeRepository drinkTypeRepository;

    public List<DrinkType> getAllDrinkTypes() {
        return drinkTypeRepository.findAll();
    }

}
