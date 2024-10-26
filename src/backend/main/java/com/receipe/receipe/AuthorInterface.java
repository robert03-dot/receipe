package com.receipe.receipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorInterface extends JpaRepository<Author,Long> {
//    List<Author> findByRecipes_Id(long id);
}