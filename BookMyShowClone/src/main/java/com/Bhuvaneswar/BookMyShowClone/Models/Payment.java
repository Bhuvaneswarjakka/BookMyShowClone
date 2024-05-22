package com.Bhuvaneswar.BookMyShowClone.Models;

import com.Bhuvaneswar.BookMyShowClone.Models.Enums.PaymentMode;
import com.Bhuvaneswar.BookMyShowClone.Models.Enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
public class Payment extends BaseModel
{
    private Instant paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
