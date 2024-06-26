package com.ufukucar.model;

public class Owner extends Person {

    private Long ownerId;
    private Long stocks;
    private Long partnershipStake;

    public Owner() {
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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