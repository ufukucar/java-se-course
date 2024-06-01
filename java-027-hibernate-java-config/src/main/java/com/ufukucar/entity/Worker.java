package com.ufukucar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table (name = "WORKERS")
public class Worker {



    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "F_NAME")
    private String fist_name;


    @NotNull
    @Column (name = "L_NAME")
    private String last_name;

    @Column (name = "AGE")
    @Size (min = 18, max = 99)
    private int age;

    @Email
    @Column (unique = true, name = "EMAIL", nullable = false)
    private String email;

    @Column (name="PHONE")
    private String phone;

    @FutureOrPresent
    @Temporal(TemporalType.DATE)
    @Column (name = "create_date")
    private Date createDate;


    @Embedded
    private Address address;




}
