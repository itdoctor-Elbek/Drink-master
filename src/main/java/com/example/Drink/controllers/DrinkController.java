package com.example.Drink.controllers;

import com.example.Drink.models.DTO.DrinkDTO;
import com.example.Drink.models.DTO.DrinkTypeDTO;
import com.example.Drink.models.entities.Drink;
import com.example.Drink.models.entities.DrinkType;
import com.example.Drink.models.mapper.DrinkMapper;
import com.example.Drink.models.mapper.DrinkTypeMapper;
import com.example.Drink.services.DrinkService;
import com.example.Drink.services.DrinkTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RestController
public class DrinkController {
    @Autowired
    private DrinkService drinkService;
    private  DrinkTypeService drinkTypeService;
    @GetMapping
    public ResponseEntity<List<DrinkDTO>> getDrinks(@RequestParam(required = false) Long drinkTypeId,
                                                    @RequestParam(required = false) Double priceFrom,
                                                    @RequestParam(required = false) Double priceTo) {
        List<Drink> drinks = drinkService.getDrinksByCriteria(drinkTypeId, priceFrom, priceTo);
        List<DrinkDTO> drinkDTOs = drinks.stream()
                .map(DrinkMapper.INSTANCE::drinkToDrinkDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(drinkDTOs);
    }

    @GetMapping("/name")
    public ResponseEntity<List<DrinkDTO>> getDrinksByName(@RequestParam String name) {

        List<Drink> drinks = drinkService.getDrinksByName(name);
        List<DrinkDTO> drinkDTOs = drinks.stream()
                .map(DrinkMapper.INSTANCE::drinkToDrinkDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(drinkDTOs);
    }

    @GetMapping("/type")
    public ResponseEntity<List<DrinkTypeDTO>> getDrinkTypes() {

        List<DrinkType> drinkTypes = drinkTypeService.getAllDrinkTypes();
        List<DrinkTypeDTO> drinkTypeDTOs = drinkTypes.stream()
                .map(DrinkTypeMapper.INSTANCE::drinkTypeToDrinkTypeDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok().body(drinkTypeDTOs);
    }
}
