package com.receipe.receipe;

import java.util.List;

public interface IAuthorService {
    List<Author> getAllAuthors();
    Author getAuthorByID(long id);
    Author createAuthor(Author author);
    void deleteAuthor(long id);
}
