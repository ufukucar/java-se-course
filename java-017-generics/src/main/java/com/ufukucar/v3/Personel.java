package com.ufukucar.v3;

public class Personel <GelenTip1 extends Number, GelenTip2> {

    // GelenTip1 illa ki sayı olacaktır!!!!


    private GelenTip1 sira;
    private GelenTip2 ad;


    public Personel(GelenTip1 sira, GelenTip2 ad) {
        this.sira = sira;
        this.ad = ad;
    }


    public void yazdir () {
        System.out.println(sira.getClass().getName() + " " + ad.getClass().getName());

    }














}
