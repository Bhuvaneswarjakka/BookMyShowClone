package com.Bhuvaneswar.BookMyShowClone.Models;

import com.Bhuvaneswar.BookMyShowClone.Models.Enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel
{
    private Instant timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
