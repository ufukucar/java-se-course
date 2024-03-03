package com.ufukucar;

public class Method_02_KupAlma {



    public  static void main ( String[] args ) {


       float sonuc =  kupAl(7.0f);

        System.out.println("Sonuc: " + sonuc);


        sonuc = sayininUssunuAlHesapYap(2.0f, 15);

        System.out.println("Sonuc: " + sonuc);

    }

    private static float kupAl(float myNumber ) {
        return (float) Math.pow(myNumber, 3);
    }


    private static float sayininUssunuAlHesapYap(float base, int pow) {
        return (float) Math.pow(base, pow);
    }

}
