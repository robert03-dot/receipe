package com.receipe.receipe;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
@Entity
public class Receipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String cookingTime;
    private String keyLevel;
    @ManyToMany
    @JoinTable(
            name = "ReceipeIngredients",
            joinColumns = @JoinColumn(name = "receipeID"),
            inverseJoinColumns = @JoinColumn(name = "ingredientID")
    )
    private List<Ingredients> ingredients;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;
}