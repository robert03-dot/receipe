package com.receipe.receipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
public class IngredientsController {
    @Autowired
    private IngredientsService ingredientsService;
    @GetMapping
    public List<Ingredients> getAllIngredients(){
        return ingredientsService.getAllIngredients();
    }
}
