package com.ufukucar;

public interface SanayiiTkenolojiBakanligiKurallari {


    public void fiseTak();

    public default void bakimHizmetiAl() {

        System.out.println("interface Bakim Hizmeti Al metodu");
    }



}
