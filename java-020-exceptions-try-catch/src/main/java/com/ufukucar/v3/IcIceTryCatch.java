package com.ufukucar.v3;

public class IcIceTryCatch {


    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;

        int toplam = 0;
        int bolme = 0;



        try {

            try {
                bolme = sayi1 / sayi2;
            }catch (ArithmeticException e) {
                System.out.println("IC HAta: " + e);
            }


            toplam = sayi1 + sayi2;
            System.out.println("DIS Toplama sonucu: " + toplam);


            bolme = sayi1 / sayi2;
            System.out.println("DIS bolme sonucu: " + bolme);


        }catch (Exception e){
            System.out.println("DIS HAta: " + e);
        }finally {
            System.out.println("Teşekkür ederiz.");
        }

        System.out.println("------------------------------------------------------------------------------------");






















    }





}
