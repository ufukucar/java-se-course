package com.ufukucar.v1;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {


        try {

            int sonuc = 2/0;

        }catch (Exception e) {
            System.out.println("Hata: " + e.getMessage());
        }

        System.out.println("-----------------------------------------");

        try {

            int sonuc = 2/0;
            System.out.println(sonuc);
        }catch (Exception e) {

            System.out.println("Hata: " + e.getMessage());
        }finally {
            System.out.println("Teşekkür ederiz. " + new Date());
        }


        System.out.println("-----------------------------------------");

        try {

           throw new ArithmeticException("ArithmeticException meydana geldi");

        }catch (Exception e) {

            System.out.println("Hata: " + e.getMessage());
        }finally {
            System.out.println("Teşekkür ederiz. " );
        }


        System.out.println("-----------------------------------------");

        try {
            sifiraBolmeHatasi();
        }catch (Exception e) {

            System.out.println("Hata: " + e.getMessage());
        }finally {
            System.out.println("Teşekkür ederiz. " );
        }


        System.out.println("-----------------------------------------");
















    }

    private static void sifiraBolmeHatasi() {
        throw new ArithmeticException("ArithmeticException meydana geldi");
    }
}