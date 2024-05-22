package com.Bhuvaneswar.BookMyShowClone.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BMS_ID")
    private int id;
    @CreationTimestamp
    private Instant createdAt;
    @UpdateTimestamp
    private Instant updatedAt;
    private String createdBy;
    private String updatedBy;
}
