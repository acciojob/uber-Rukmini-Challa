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
@Table(name = "Cab")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    int perKmRate;

    boolean available;


    //For mapping
    @OneToOne
    @JoinColumn
    Driver driver;


    public boolean getAvailable() {
        return true;
    }
}

