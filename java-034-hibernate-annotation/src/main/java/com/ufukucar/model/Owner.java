package com.ufukucar.model;


import javax.persistence.*;

@Entity
@Table(name="OWNER")
@AttributeOverrides({
        @AttributeOverride(name="firstname", column=@Column(name="FIRSTNAME")),
        @AttributeOverride(name="lastname", column=@Column(name="LASTNAME"))
})

public class Owner extends Person {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "OWNER_ID")
    private Long ownerId;

    @Column(name="stocks")
    private Long stocks;

    @Column(name="partnership_stake")
    private Long partnershipStake;

    public Owner()  {
        super();
    }

    public Owner(Long stocks, Long partnershipStake) {
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }

    public Owner(String firstname, String lastname, Long stocks, Long partnershipStake) {
        super(firstname, lastname);
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }

    public Long getStocks() {
        return stocks;
    }

    public void setStocks(Long stocks) {
        this.stocks = stocks;
    }

    public Long getPartnershipStake() {
        return partnershipStake;
    }

    public void setPartnershipStake(Long partnershipStake) {
        this.partnershipStake = partnershipStake;
    }




























}