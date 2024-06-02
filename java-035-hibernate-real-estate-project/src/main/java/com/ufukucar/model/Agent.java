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
@Table ( name = "AGENTS")

public class Agent {

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

    @Column (name = "OFFICE_ADDRESS")
    private String officeAddress;


    // 1        -       m
    // Agent    -Property

    @OneToMany(
            mappedBy = "agent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Property> properties  = new HashSet<>();


/*

    @OneToOne (mappedBy = "agent",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private com.ufukucar.entity.AgentDetail agentDetail;

*/



}
