package com.ufukucar.entity;

import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Person {

    private Long personId;
    private String firstname;
    private String lastname;
}
