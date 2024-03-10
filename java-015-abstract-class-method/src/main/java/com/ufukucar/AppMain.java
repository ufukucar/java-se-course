package com.ufukucar;

public class AppMain {

    public static void main(String[] args) {


        Kedi kedi = new Kedi();
        kedi.hareketEt();


        System.out.println("---------------------------------");

        Robot robot = new Robot();
        robot.bakimHizmetiAl();
        System.out.println("---------------------------------");

        Canli canli = new Canli();


    }


}
