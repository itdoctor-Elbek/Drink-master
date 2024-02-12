package com.example.Drink.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
@Table(name = "tb_drink")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String name;
    Integer size;
    double price;

    @ManyToOne
    DrinkType drinkTypes;

    @ManyToMany
    List<Ingredient> ingredient;



}
