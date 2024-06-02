package com.ufukucar.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table ( name = "PROPERTIES")

public class Property {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PROPERTY_NAME")
    private String propertyName;

    @Column(name = "TITLE")
    private String title;

    @Column (name = "DESCRIPTION")
    private String description;

    @Column (name = "TYPE")
    private String type;

    @Column (name = "PRICE")
    private Double price;



    // m        -       1
    // Property    - Agent
    // Many to One
    @ManyToOne
    @JoinColumn (name = "agent_id")
    private Agent agent;


    // m        -       1
    // Property    - Seller
    // Many to One
    @ManyToOne
    @JoinColumn (name = "seller_id")
    private Seller seller;



    //   m       -      m
    // Property  -     Buyer
    @ManyToMany
    @JoinTable ( name = "Property_Buyer",
        joinColumns = @JoinColumn( name = "property_id"),
        inverseJoinColumns = @JoinColumn(name = "buyer_id")

    )
    private Set <Buyer> buyers = new HashSet<>();






}
