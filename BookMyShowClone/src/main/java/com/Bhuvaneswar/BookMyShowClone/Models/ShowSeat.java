package com.Bhuvaneswar.BookMyShowClone.Models;

import com.Bhuvaneswar.BookMyShowClone.Models.Enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel
{
    private int price;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}
