package com.receipe.receipe;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
//    @OneToMany(mappedBy = "author")
//    private List<Receipe> receipes;
}
