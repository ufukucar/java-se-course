package com.ufukucar.entity;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor


public class Owner extends Person {

    private Long stocks;
    private Long partnershipStake;

}