package com.ufukucar.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

@Data // @Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name="first_name")
    private String firstName;

    private String lastName;

    @Email
    @Column(unique=true)
    private String email;








}
