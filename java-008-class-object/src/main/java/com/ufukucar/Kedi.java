package com.ufukucar;

public class Kedi {

    int yas = 0;

    String rengi = "Belirtilmedi";

    public Kedi(int yas, String rengi) {
        this.yas = yas;
        this.rengi = rengi;
    }

    public void setYas (int yas ) {
        this.yas = yas;
    }

    public void setRengi ( String rengi ) {
        this.rengi = rengi;
    }


    public int getYas() {
        return yas;
    }

    public String getRengi() {
        return rengi;
    }

    public static void main(String [] args) {

        Kedi kedi1 = new Kedi(5, "Beyaz");
        Kedi kedi2 = new Kedi(10, "Sarı");
        Kedi kedi3 = new Kedi(15, "Siyah");

        System.out.println("Kedi 1 Özellikleri--->  Yaş: " + kedi1.yas + ", Rengi: " + kedi1.rengi);
        System.out.println("Kedi 2 Özellikleri--->  Yaş: " + kedi2.yas + ", Rengi: " + kedi2.rengi);
        System.out.println("Kedi 3 Özellikleri--->  Yaş: " + kedi3.yas + ", Rengi: " + kedi3.rengi);

        kedi1.setYas(6);
        System.out.println("Kedi 1 Özellikleri--->  Yaş: " + kedi1.yas + ", Rengi: " + kedi1.rengi);

        System.out.println("Kedi 2 Özellikleri--->  Yaş: " + kedi2.getYas() + ", Rengi: " + kedi2.getRengi());


    }



}
