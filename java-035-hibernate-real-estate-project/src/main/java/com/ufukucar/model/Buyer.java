package com.ufukucar.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table( name = "BUYERS")
@ToString

public class Buyer {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "FIRST_NAME")
    private String firstName;

    @Column (name = "LAST_NAME")
    private String lastName;

    @Column (name = "EMAIL")
    private String email;

    @Column (name = "PHONE")
    private String phone;

    //  m       -      m
    // Buyer        Property
    @ManyToMany(
            mappedBy = "buyers",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set <Property> properties = new HashSet<>();











}
