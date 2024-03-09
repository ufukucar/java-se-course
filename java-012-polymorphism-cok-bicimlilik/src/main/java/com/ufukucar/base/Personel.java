package com.ufukucar.base;

import lombok.*;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Personel {


    private String adi;

    private String soyadi;

    private String telefonNo;

    private String departmani;

    private int sicilNo;

    private String tahsilDurumu;

    private short tecrubeYili;


    public void bilgisiniYaz (Personel personel) {
        System.out.println("Adı: " + personel.getAdi());
        System.out.println("Soyadi: " + personel.getSoyadi());
        System.out.println("Telefon: " + personel.getTelefonNo());
        System.out.println("Departman: " + personel.getDepartmani());
        System.out.println("Sicil No: " + personel.getSicilNo());
        System.out.println("Tahsil Durumu: " + personel.getTahsilDurumu());
    }


    public void hesapla () {

    }

    public void hesapla ( int yil ) {

    }

    public void hesapla ( int yil, int ay ) {

    }

    public void hesapla ( int yil, int ay, short gun ) {

    }

    public void hesapla ( short ay, int yil, short gun ) {

    }
    public String hesapla ( short ay, short yil, short gun ) {

        return "Selam";
    }

}
