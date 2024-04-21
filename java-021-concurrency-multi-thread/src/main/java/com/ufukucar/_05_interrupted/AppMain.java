package com.ufukucar._05_interrupted;


public class AppMain {


    public static long sayac = 0;

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();


        final var mainThread = Thread.currentThread();

        new Thread( () -> {
            for (int i = 0; i < 100 ; i++) {
                sayac++;
                System.out.println("SELAM: " + i );

                try {
                    Thread.sleep(10);
                }catch (InterruptedException e){
                    System.out.println("HATA: " + e);
                }

                System.out.println("Sayac: " + sayac);
                if ( sayac == 25 ) {
                    mainThread.interrupt();
                    break;
                }

            }


        }).start();



        long endTime = System.currentTimeMillis();


        long elapsedTime = endTime - startTime;


        System.out.println("StartTime : " + startTime);
        System.out.println("End time: " + endTime);
        System.out.println("Elapsed time: " + elapsedTime);







    }
}