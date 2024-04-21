package com.ufukucar.v1;

import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {


        ArrayList myArrayList = new ArrayList();

        myArrayList.add("A");
        myArrayList.add(10);
        myArrayList.add(true);


        ArrayList <String> myArrayList2 = new ArrayList();
        myArrayList2.add("B");


        PersonelList myPersonelList1 = new PersonelList();

        PersonelList <String> myPersonelList2 = new PersonelList();

        myPersonelList2.listeyeEkle("Emre");
        myPersonelList2.listeyeEkle("Barış");
        myPersonelList2.listeyeEkle("Dilşat");
        System.out.println(myPersonelList2.listeyiGetir());;


        PersonelList <Integer> myPersonelList3 = new PersonelList();
        myPersonelList3.listeyeEkle(10);
        myPersonelList3.listeyeEkle(20);
        myPersonelList3.listeyeEkle(30);
        System.out.println(myPersonelList3.listeyiGetir());

        PersonelList <Personel> myPersonelList4 = new PersonelList();

        Personel p1 = new Personel();
        p1.setAdi("Eyüp");
        p1.setSoyadi("Özteriş");
        p1.setYasi(21);

        myPersonelList4.listeyeEkle(p1);
        System.out.println(myPersonelList4.listeyiGetir());

        // TODO BUNU YAPMAYA CALIS - TOSTRING OLMADAN YAP
        System.out.println(myPersonelList4.listeyiGetir());




    }
}