package com.ufukucar.veteriner;

import com.ufukucar.base.Hayvan;

public class Kopek extends Hayvan {


    public Kopek() {
        System.out.println("KÖPEK");
    }

    @Override
    public void sesVer() {

        System.out.println("Köpek: Hav Hav");
    }

}
