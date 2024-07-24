package com.receipe.receipe;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Author {
    @Id
    @GeneratedValue
    private long id;
    private String name;

}
