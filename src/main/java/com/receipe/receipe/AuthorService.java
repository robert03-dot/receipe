package com.receipe.receipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private AuthorInterface authorInterface;

    @Override
    public List<Author> getAllAuthors() {
        return authorInterface.findAll();
    }

    @Override
    public Author getAuthorByID(long id) {
        return authorInterface.findById(id).orElse(null);
    }

    @Override
    public Author createAuthor(Author author) {
        return authorInterface.save(author);
    }

    @Override
    public void deleteAuthor(long id) {
        authorInterface.deleteById(id);
    }
}