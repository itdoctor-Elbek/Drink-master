package com.example.Drink.models.mapper;

import com.example.Drink.models.DTO.DrinkTypeDTO;
import com.example.Drink.models.entities.DrinkType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DrinkTypeMapper {
    DrinkTypeMapper INSTANCE = Mappers.getMapper(DrinkTypeMapper.class);

    DrinkTypeDTO drinkTypeToDrinkTypeDTO(DrinkType drinkType);
}
