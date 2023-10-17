package com.bikerent.bikerentapplication;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
    @Id
    private Long id;
    private String serialNo;
    private double hourPrice;
    private double dayPrice;
    private String borrowerId;

    public Bike() {
    }
}
