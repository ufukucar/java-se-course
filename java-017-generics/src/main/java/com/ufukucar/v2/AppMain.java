package com.ufukucar.v2;

import com.ufukucar.v1.PersonelList;

import java.util.ArrayList;
import java.util.LinkedList;

public class AppMain {
    public static void main(String[] args) {


        Personel obj = new Personel();

        obj.ekranaYaz(10, "Seren");
        System.out.println("--------------------------------");
        obj.ekranaYaz(10.54f, "Seren");
        System.out.println("--------------------------------");
        obj.ekranaYaz(10.60, "Seren");
        System.out.println("--------------------------------");
        obj.ekranaYaz(10, "Seren ", "Aşkın");
        System.out.println("--------------------------------");


        LinkedList <Integer> ogrenciNoList = new LinkedList<>();

        ogrenciNoList.add(10);
        ogrenciNoList.add(20);
        ogrenciNoList.add(30);


        ArrayList <String> ogrenciAdList = new ArrayList<>();
        ogrenciAdList.add("Seren");
        ogrenciAdList.add("Aşkın");
        ogrenciAdList.add("Antalya");

        obj.ekranaYaz(ogrenciNoList, ogrenciAdList);


    }
}