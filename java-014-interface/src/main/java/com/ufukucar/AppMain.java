package com.ufukucar;

import com.ufukucar.tasit.Ucak;

public class AppMain {

    public static void main(String[] args) {



        Ucak ucak = new Ucak();
        ucak.setMarka("Boeing");
        ucak.setKoltukSayisi((short) 450);
        ucak.setTekerSayisi((short) 3);

        System.out.println(ucak);

        System.out.println("-------------------");
        System.out.println("Bakım durumu: " + ucak.bakimDurumu());
        System.out.println("Taşıt Vergisi: " + ucak.tasitVerigis());
        System.out.println("Dernek Durumu: " + ucak.dernekUyeDurumu());
        System.out.println("Koltuk Sayısı: " + ucak.getKoltukSayisi());
        System.out.println("Marka: " + ucak.getMarka());



    }


}
