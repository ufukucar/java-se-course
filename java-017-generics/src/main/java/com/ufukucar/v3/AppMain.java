package com.ufukucar.v3;

public class AppMain {
    public static void main(String[] args) {


        Personel <Integer, String> personel1 = new Personel<> (100, "Abdullah");
        Personel <Float, String> personel2 = new Personel<> (14.53f, "Fatih");
        Personel <Double, String> personel3 = new Personel<> (14.53, "Fatih");
        Personel <Long, String> personel4 = new Personel<> (1445L, "Fatih");


        personel1.yazdir();
        personel2.yazdir();
        personel3.yazdir();
        personel4.yazdir();


        /**
         *
         *  GENEL BILGI:
         *
         *  short + short = int
         *
         *  byte + short = int
         *
         *  byte + byte = int
         *
         *
         */

    }
}