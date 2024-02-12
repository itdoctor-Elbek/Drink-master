package com.example.Drink.repositories;

import com.example.Drink.models.entities.DrinkType;
import com.example.Drink.services.DrinkTypeService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkTypeRepository extends JpaRepository<DrinkType,Long> {

}
