package com.ufukucar;


public class Loop_02_foreach {
    public static void main(String[] args) {

        String student1  = "Barış";
        String student2 = "İbrahim";
        String student3 = "Emre";
        String student4 = "Osman";

        System.out.println("------------------------------------------------");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("------------------ FOREACH ---------------------");

        String  [] students = { "Barış", "İbrahim", "Emre", "Osman"};

        for ( String student : students ) {
            System.out.println(student);
        }

        System.out.println("------------------------------------------------");

        int [] arrYears = {2000, 2005, 2008, 2017, 2024};

        for ( int year : arrYears ) {
            System.out.println(year);
        }

        System.out.println("------------------------------------------------");

    }
}