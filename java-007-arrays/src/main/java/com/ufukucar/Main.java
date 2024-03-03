package com.ufukucar;

public class Main {
    public static void main(String[] args) {


        int [] sayilar = {10,15,20,25};

        for (int i = 0; i < sayilar.length ; i++) {
            System.out.println(sayilar[i]);
        }

        System.out.println("---------------------------------");

        for  ( int sayi : sayilar ) {
            System.out.println(sayi);
        }

        System.out.println("---------------------------------");


        int [] [] myNumberArr = new int [3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5 ; j++) {
                myNumberArr[i][j] = Math.random() * 10;
                System.out.println("i: " + i +  "    j: " + j);
            }
        }


    }
}