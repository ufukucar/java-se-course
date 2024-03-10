package com.ufukucar.veteriner;

import com.ufukucar.base.Hayvan;

public class Kus extends Hayvan {



    public Kus() {
        System.out.println("KUŞ");
    }

    @Override
    public void sesVer() {

        System.out.println("Kus: Cik Cik");
    }

    public void yemekYe() {
        System.out.println("Kuş: Yem ye");
    }



}

