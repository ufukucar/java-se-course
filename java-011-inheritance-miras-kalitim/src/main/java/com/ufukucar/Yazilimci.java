package com.ufukucar;


import lombok.*;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString (callSuper = true)

public class Yazilimci extends Personel {


    private String calismaDurumu;


    public void bilgisiniYaz (Yazilimci yazilimci) {
        System.out.println("Adı: " + yazilimci.getAdi());
        System.out.println("Soyadi: " + yazilimci.getSoyadi());
        System.out.println("Telefon: " + yazilimci.getTelefonNo());
        System.out.println("Departman: " + yazilimci.getDepartmani());
        System.out.println("Sicil No: " + yazilimci.getSicilNo());
        System.out.println("Tahsil Durumu: " + yazilimci.getTahsilDurumu());
        System.out.println("Tecrübe: " + yazilimci.getTecrubeYili());
        System.out.println("Çalışma Durumu: " + yazilimci.getCalismaDurumu());


    }





















}
