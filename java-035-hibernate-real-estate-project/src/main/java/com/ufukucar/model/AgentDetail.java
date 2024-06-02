package com.ufukucar.entity;

import com.ufukucar.model.Agent;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "AGENT_DETAILS")
public class AgentDetail {

 /*   @OneToOne
    @JoinColumn
    private Agent agent;*/

    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "foreign" ,
            parameters = @org.hibernate.annotations.Parameter(name = "property", value = "agent"))
    @Column(name = "AGENT_ID")
    private int agentId;

    // TODO  @MapsId ile modernleştirilecek.


    private String address;
    private String phoneNumber;
    private String email;

    @Temporal(TemporalType.DATE)
    @Column (name = "DATE_CREATE")
    private Date createDate;





}