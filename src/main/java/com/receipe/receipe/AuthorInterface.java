package com.receipe.receipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorInterface extends JpaRepository<Author,Long> {
    List<Receipe> findByReceipe(long id);
}
