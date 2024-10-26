package com.receipe.receipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientInterface extends JpaRepository<Ingredients,Long> {
//    List<Ingredients> findByName(String name);
}
