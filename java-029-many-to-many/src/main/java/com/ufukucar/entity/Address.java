package com.ufukucar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Embeddable
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="ADDRESS")
public class Address {


    //  m - m
    @ManyToMany( mappedBy = "addresses", fetch = FetchType.LAZY )
    Set <Customer> addresses = new HashSet<>();


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private int id;

    @Column(name = "COUNTRY", length = 50, nullable = false)
    private String country;

    @Column(name = "CITY", length = 55)
    private String city;


    @Column(name = "STREET")
    private String street;





}
