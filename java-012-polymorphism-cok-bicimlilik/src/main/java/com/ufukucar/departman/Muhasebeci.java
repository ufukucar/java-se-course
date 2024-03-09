package com.ufukucar.departman;

import com.ufukucar.base.Personel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Muhasebeci extends Personel {


    private Boolean yeminDurumu;

    private String unvani;

    public void bilgisiniYaz (Muhasebeci muhasebeci) {
       /* System.out.println("Adı: " + muhasebeci.getAdi());
        System.out.println("Soyadi: " + muhasebeci.getSoyadi());
        System.out.println("Telefon: " + muhasebeci.getTelefonNo());
        System.out.println("Departman: " + muhasebeci.getDepartmani());
        System.out.println("Sicil No: " + muhasebeci.getSicilNo());*/

        super.bilgisiniYaz(muhasebeci);
        System.out.println("Tahsil Durumu: " + muhasebeci.getTahsilDurumu());
        System.out.println("Tecrübe: " + muhasebeci.getTecrubeYili());

        String yeminDurumu;
        if ( muhasebeci.getYeminDurumu() ) {
            yeminDurumu = "YEMİNLİ";
        }else {
            yeminDurumu = "YEMİNSİZ";
        }
        System.out.println("Yemin Durumu: " + yeminDurumu);
        System.out.println("Ünvanı: " + muhasebeci.getUnvani());


    }


}
