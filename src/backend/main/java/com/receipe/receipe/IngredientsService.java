package com.receipe.receipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {
    @Autowired
    private IngredientInterface ingredientInterface;
    public List<Ingredients> getAllIngredients(){
        return ingredientInterface.findAll();
    }
}
