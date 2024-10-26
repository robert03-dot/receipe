package com.receipe.receipe;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Table(name = "Author")
@Entity
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String first_name;
    private String last_name;
    @OneToMany(mappedBy = "author",fetch=FetchType.EAGER)
    private List<Receipe> recipes;
}