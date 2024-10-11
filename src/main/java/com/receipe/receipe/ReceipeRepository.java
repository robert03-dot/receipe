package com.receipe.receipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public interface ReceipeRepository extends JpaRepository<Receipe, Long> {
//        List<Receipe> findByAuthor(Author author);
        //author,ingredients,tutorials,mysql database(receipe,authors,ingredients)
}