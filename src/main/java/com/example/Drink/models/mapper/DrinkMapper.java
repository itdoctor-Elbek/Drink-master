package com.example.Drink.models.mapper;

import com.example.Drink.models.DTO.DrinkDTO;
import com.example.Drink.models.DTO.DrinkTypeDTO;
import com.example.Drink.models.entities.Drink;
import com.example.Drink.models.entities.DrinkType;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DrinkMapper {


    DrinkMapper INSTANCE = Mappers.getMapper(DrinkMapper.class);


    DrinkDTO drinkToDrinkDTO(Drink drink);
}
