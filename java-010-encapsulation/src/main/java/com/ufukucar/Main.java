package com.ufukucar;

public class Main {
    public static void main(String[] args) {


        Yatirimci yatirimci1 = new Yatirimci();

        Yatirimci yatirimci2 = new Yatirimci("Ufuk", "Uçar", "Merkez Şube",
                                        123456789L, "645378454839741", 100_000.55 );

        Yatirimci yatirimci3 = new Yatirimci("Burcu", "Uçar");

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);

        System.out.println("--------------------------------------------------------------------------------------------");
        yatirimci1.setAdi("Hikmet");
        yatirimci1.setSoyadi("Yılmaz");
        yatirimci1.setHesapNo(1111111111L);
        yatirimci1.setSubesi("Kızılay");
        yatirimci1.setIbanNo("6541654646515");
        yatirimci1.setHesapTutari(25_000.44);

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);

        System.out.println("--------------------------------------------------------------------------------------------");

        yatirimci3.setHesapNo(2222222222222L);
        yatirimci3.setSubesi("Kadıkoy");
        yatirimci3.setIbanNo("87842125454248");
        yatirimci3.setHesapTutari(99_000.77);

        System.out.println(yatirimci1);
        System.out.println(yatirimci2);
        System.out.println(yatirimci3);

        System.out.println("--------------------------------------------------------------------------------------------");


        System.out.println(yatirimci2.getAdi() + " " + yatirimci2.getSoyadi() + " " +
                           yatirimci2.getHesapNo()
        );

        System.out.println("--------------------------------------------------------------------------------------------");

        yatirimci1.bilgisiniVer();

        System.out.println("--------------------------------------------------------------------------------------------");





    }
}