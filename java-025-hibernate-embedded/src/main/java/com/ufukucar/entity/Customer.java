package com.ufukucar.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "CUSTOMERS")

public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;


    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;


    @Column(name = "last_name", length = 55)
    private String lastName;

    @Temporal(TemporalType.DATE)
    @Column (name = "create_date")
    private Date createDate;

    /*
    private String country;
    private String city;
    private String state;
    private String zip;
    */

    //private String phone;

    @Embedded
    private Address address;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    /*
    public void setId(int id) {
        this.id = id;
    }
    */

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

























}
