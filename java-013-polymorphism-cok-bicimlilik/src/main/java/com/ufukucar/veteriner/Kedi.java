package com.ufukucar.veteriner;

import com.ufukucar.base.Hayvan;

public class Kedi extends Hayvan {


    public Kedi() {
        System.out.println("KEDİ");
    }



    @Override
    public void sesVer() {

        System.out.println("Kedi: Miyav Miyav");
    }


}
