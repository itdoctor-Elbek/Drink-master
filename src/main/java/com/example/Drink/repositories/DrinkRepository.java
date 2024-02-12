package com.example.Drink.repositories;

import com.example.Drink.models.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink,Long> {
    List<Drink> findByDrink(String name);
    List<Drink> findByPrice(double priceFrom, double priceTo);

    List<Drink> findByNameContaining(String name);

    List<Drink> findByDrinkTypeId(Long typeId);
}
