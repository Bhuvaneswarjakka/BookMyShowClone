package com.Bhuvaneswar.BookMyShowClone.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel
{
    private String name;
    @ManyToMany
    private List<Movie> movies;
}
