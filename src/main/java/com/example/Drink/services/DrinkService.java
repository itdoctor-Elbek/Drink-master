package com.example.Drink.services;

import com.example.Drink.models.entities.Drink;
import com.example.Drink.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepository drinkRepository;

    // Tüm içecekleri getiren metod
    public List<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }

    // İsim bazında içecekleri getiren metod
    public List<Drink> getDrinksByName(String name) {
        return drinkRepository.findByNameContaining(name);
    }

    // Tip bazında içecekleri getiren metod
    public List<Drink> getDrinksByType(Long typeId) {
        return drinkRepository.findByDrinkTypeId(typeId);
    }

    public List<Drink> getDrinksByCriteria(Long drinkTypeId, Double priceFrom, Double priceTo) {
        return null;
    }
}
