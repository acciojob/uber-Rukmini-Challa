package com.driver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "TripBooking")
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int tripBookingId;

    String fromLocation;

    String toLocation;

    int distanceInKm;

    TripStatus status;

    int bill;


    //For mapping to customer(parent)
    @ManyToOne
    @JoinColumn
    Customer customer;

    //For mapping to driver(parent)
    @ManyToOne
    @JoinColumn
    Driver driver;
}
