package com.ufukucar;

import java.util.Optional;

public class AppMain {
    public static void main(String[] args) {

        Student student = new Student("Banu");
        System.out.println("Student 1: " + student);
        System.out.println(student.getIdNumber());
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println("----------------------------------");

        student = null;
/*

        if ( student != null )
            System.out.println("----------------------------------");
        else {
            // FIXME burayı duzeltecegiz
            student = new Student();
            student.setIdNumber(1);
            student.setFirstName("Banu");
            student.setLastName("Nur");
            System.out.println("Student 2: " + student) ;
            System.out.println("Durum: " + student.getIdNumber());
        }

        System.out.println("----------------------------------");*/

        try {
            System.out.println(student.getIdNumber());
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
        }catch (Exception e){
            System.out.println("HATA: " + e);
        }


        System.out.println("----------------------------------");

        String [] myArrary = new String [10];

        String myWord = myArrary[6];
        System.out.println(myWord);


        System.out.println("----------------------------------");

        String [] myArrary2 = new String [10];

        // Dizinin null olup olmadığını kontrol etmek istersek
        Optional <String []> nullKontrol = Optional.ofNullable(myArrary2);
        System.out.println(nullKontrol);
        System.out.println(nullKontrol.get());
        System.out.println(nullKontrol.get().length);
        /** Optional ile iş yapıyorsak get ile nesneyi dışarı almalıyız. */
        System.out.println("----------------------------------");

        myArrary2 = null;
        Optional <String []> nullKontrol2 = Optional.ofNullable(myArrary2);
        System.out.println(nullKontrol2);
        System.out.println("----------------------------------");

        if ( nullKontrol2.isEmpty() ) {
            System.out.println("Dizi boş");
        }

        if ( nullKontrol2.isPresent() ) {
            System.out.println("Dizi doulu");
        }
        System.out.println("----------------------------------");




    }






}