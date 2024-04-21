package com.ufukucar._04_sleep;


public class AppMain {
    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();


        try {

            Thread.sleep(2000);

        }catch (InterruptedException e){
            System.out.println("HATA: " + e);
        }


        long endTime = System.currentTimeMillis();


        long elapsedTime = endTime - startTime;


        System.out.println("StartTime : " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Elapsed time: " + elapsedTime);








    }
}