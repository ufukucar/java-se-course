package com.ufukucar;

// POJO, constructor, setter ve getter ların olduğu hali. Model (Kalıp)
public class Student {


    private Integer idNumber;
    private String firstName;
    private String lastName;


    public Student() {
    }


    public Student(Integer idNumber, String firstName, String lastName) {
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public Student(String firstName) {
    }


    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

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
