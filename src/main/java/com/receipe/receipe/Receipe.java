package com.receipe.receipe;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Receipe {
    private long id;
    private String name;
    private String description;
    private String cookingTime;
    private String keyLevel;
    private List<Ingredients> ingredients;
    private Author author;
}
