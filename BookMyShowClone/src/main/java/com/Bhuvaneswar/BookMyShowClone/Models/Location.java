package com.Bhuvaneswar.BookMyShowClone.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Location extends BaseModel
{
    private String city;
    @OneToMany
    private List<Theatre> theatres;

}
