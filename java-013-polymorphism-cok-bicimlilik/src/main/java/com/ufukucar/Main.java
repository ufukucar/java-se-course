package com.ufukucar;

import com.ufukucar.base.Hayvan;
import com.ufukucar.veteriner.Kedi;
import com.ufukucar.veteriner.Kopek;
import com.ufukucar.veteriner.Kus;

public class Main {
    public static void main(String[] args) {


        Kedi kedi = new Kedi();
        System.out.println("------------------------------");
        Kopek kopek = new Kopek();
        System.out.println("------------------------------");
        Kus kus = new Kus();
        System.out.println("------------------------------");

        kedi.sesVer();
        System.out.println("------------------------------");
        kopek.sesVer();
        System.out.println("------------------------------");
        kus.sesVer();
        System.out.println("------------------------------");


        if ( kedi instanceof Hayvan) {
            System.out.println("EVET");
        }else {
            System.out.println("HAYIR");
        }

        System.out.println("------------------------------");


        Hayvan hayvan = new Hayvan();
        //hayvan.sesVer();

        System.out.println("------------------------------");


    }


}