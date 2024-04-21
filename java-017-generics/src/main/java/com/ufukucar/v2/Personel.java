package com.ufukucar.v2;

import java.util.StringJoiner;

public class Personel  {


    /**
    public void ekranaYaz() {
        System.out.println("Ekrana Yaz");
    }


    public void ekranaYaz(int sira, String ad) {
        System.out.println("Sıra: " + sira + ", Bilgi: " + ad);
    }

    public void ekranaYaz(int sira, String ad, String soyad) {
        System.out.println("Sıra: " + sira + ", Bilgi: " + ad + ", soyad: " + soyad);
    }

    */

    // Yukarıdaki kodlardan kurtulmak için..

    /** GENERIC BIR METOT YAZMALI */

    public <GelenTip1, GelenTip2> void ekranaYaz(GelenTip1 sira, GelenTip2 ad) {
        System.out.println("Sıra: " + sira + ", Bilgi: " + ad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
    }

    public  <GelenTip1, GelenTip2, GelenTip3> void ekranaYaz(GelenTip1 sira, GelenTip2 ad, GelenTip3 soyad) {
        System.out.println("Sıra: " + sira + ", Bilgi: " + ad + ", soyad: " + soyad);
        System.out.println(sira.getClass());
        System.out.println(ad.getClass());
        System.out.println(soyad.getClass());
    }

}
