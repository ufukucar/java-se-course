package com.ufukucar.v4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiTryCatch {


    public static void main(String[] args) {

        int sayi1 = 0;
        int sayi2 = 0;

        int toplam = 0;
        float bolme = 0;

        Scanner scanner = new Scanner(System.in);

        boolean hataDurumuFlag = true;

        do {

            try {

                System.out.println("Lütfen 1. sayiyi giriniz: ");
                sayi1 = scanner.nextInt();

                System.out.println("Lütfen 2. sayiyi giriniz: ");
                sayi2 = scanner.nextInt();

                toplam =  sayi1 + sayi2;
                System.out.println("Toplam: " + toplam);

                bolme =   (float) sayi1 / (float) sayi2;
                System.out.println("Bolme: " + bolme);




            }catch (ArithmeticException e) {
                System.out.println("Hata durumu: " + e);

            }catch (InputMismatchException e) {
                System.out.println("Hata durumu: " + e);

            }catch (RuntimeException e) {
                System.out.println("Hata durumu: " + e);

            }catch (Exception e) {
                System.out.println("Hata durumu: " + e);

            }finally {
                hataDurumuFlag = false;
                System.out.println("------------------------------------------------");
            }



        }while (hataDurumuFlag);













    }











}
