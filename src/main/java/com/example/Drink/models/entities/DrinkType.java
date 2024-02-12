package com.example.Drink.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tb_drinktype")
public class DrinkType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String name;


}
