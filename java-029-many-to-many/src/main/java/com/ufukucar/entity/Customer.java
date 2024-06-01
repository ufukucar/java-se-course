package com.ufukucar.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    //  m - m
    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinTable(
            name = "CUSTOMERS_ADDRESS",
            joinColumns = {
                @JoinColumn( name = "CUSTOMER_ID", nullable = false)
            },

            inverseJoinColumns = {
                @JoinColumn( name = "ADDRESS_ID", nullable = false)
            }
    )
    Set <Address> addresses = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int customerId;

    @Column(name = "FIRST_NAME", length = 50, nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", length = 55)
    private String lastName;


    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}