package com.ufukucar.model;

import javax.persistence.*;

import java.util.Date;


@Entity
@Table(name="EMPLOYEE")
@AttributeOverrides({
        @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
        @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})

public class Employee extends Person {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private Long employee_id;

    @Column(name="joining_date")
    private Date joiningDate;

    @Column(name="department_name")
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