package com.receipe.receipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientInterface extends JpaRepository<Author,Ingredients> {
    List<Receipe> findByIngredients(Ingredients ingredients);
}
