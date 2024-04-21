package com.ufukucar.v1;

import java.util.ArrayList;

public class PersonelList <T> {


    private int a;

    private Integer b;

    private T c;

     ArrayList <T> myArrayPersonList = new ArrayList<>();


    public void listeyeEkle(T veri) {

        myArrayPersonList.add(veri);

    }

    public ArrayList <T> listeyiGetir() {
        return myArrayPersonList;
    }




}
