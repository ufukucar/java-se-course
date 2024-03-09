package com.ufukucar;

import com.ufukucar.base.Personel;
import com.ufukucar.departman.Mudur;
import com.ufukucar.departman.Muhasebeci;
import com.ufukucar.departman.Yazilimci;

public class AppMain {


    public static void main(String[] args) {


        Mudur mudur = new Mudur();

        mudur.setAdi("Ufuk");
        mudur.setSoyadi("Uçar");
        mudur.setMakamAraci(true);
        mudur.setTahsilDurumu("Üniversite");
        mudur.setDepartmani("IT MUDUR");
        mudur.setSicilNo(123456789);
        mudur.setTelefonNo("050555536389");

        mudur.bilgisiniYaz(mudur);

        System.out.println("-----------------------------------------------");

        Yazilimci yazilimci = new Yazilimci();

        yazilimci.setAdi("Ufuk 2");
        yazilimci.setSoyadi("Uçar 2");
        yazilimci.setTahsilDurumu("Master");
        yazilimci.setDepartmani("IT - YAZILIMCI");
        yazilimci.setSicilNo(999999999);
        yazilimci.setTelefonNo("05555225535");
        yazilimci.setCalismaDurumu("Uzaktan");
        yazilimci.setTecrubeYili((short) 5);

        System.out.println(yazilimci);
        //yazilimci.bilgisiniYaz(yazilimci);

        System.out.println("-----------------------------------------------");


        Muhasebeci muhasebeci = new Muhasebeci();

        muhasebeci.setAdi("Ufuk 3");
        muhasebeci.setSoyadi("Uçar 3");
        muhasebeci.setTahsilDurumu("Doktora");
        muhasebeci.setDepartmani("Muhasebe");
        muhasebeci.setSicilNo(999999999);
        muhasebeci.setTelefonNo("056321535525");
        muhasebeci.setUnvani("Müşavir");
        muhasebeci.setYeminDurumu(false);
        muhasebeci.setTecrubeYili((short) 5);


        muhasebeci.bilgisiniYaz(muhasebeci);

        System.out.println("-----------------------------------------------");

        Personel personel = new Personel();



    }

}
