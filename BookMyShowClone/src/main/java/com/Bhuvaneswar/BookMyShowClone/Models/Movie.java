package com.Bhuvaneswar.BookMyShowClone.Models;

import com.Bhuvaneswar.BookMyShowClone.Models.Enums.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel
{
    private String name;
    private String Description;
    @OneToMany
    private List<Actor> actors;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<MovieFeature> movieFeatures;
    private String releaseDate;
    private String poster;
    private String trailer;
    private double rating;
    private int duration;
}
