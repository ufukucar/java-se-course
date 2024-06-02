package com.ufukucar.model;

import java.util.Date;

public class Employee extends Person {

    private Date joiningDate;
    private String departmentName;

    public Employee() {
        super();
    }

    public Employee(Date joiningDate, String departmentName) {
        this.joiningDate = joiningDate;
        this.departmentName = departmentName;
    }

    public Employee(String firstname, String lastname, Date joiningDate, String departmentName) {
        super(firstname, lastname);
        this.joiningDate = joiningDate;
        this.departmentName = departmentName;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}