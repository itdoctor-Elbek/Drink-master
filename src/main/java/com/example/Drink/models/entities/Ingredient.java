package com.example.Drink.models.entities;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Data
@Table(name = "tb_tur")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    Long id;
    String name;
}
