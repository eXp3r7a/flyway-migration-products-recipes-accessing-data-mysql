package com.example.flyway_migration_products_recipes_accessing_data_mysql;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "recipes")
@Data
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long id;

    private String name;

    private String category;

    private String description;

}
