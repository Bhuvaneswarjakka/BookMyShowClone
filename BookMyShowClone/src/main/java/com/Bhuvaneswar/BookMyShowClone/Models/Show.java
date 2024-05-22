package com.Bhuvaneswar.BookMyShowClone.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel
{
    private Instant startTime;
    private Instant endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    private List<ShowSeat> showSeats;

}
