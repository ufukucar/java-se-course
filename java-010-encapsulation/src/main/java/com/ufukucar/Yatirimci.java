package com.ufukucar;

import java.util.StringJoiner;

public class Yatirimci {

    private String adi;

    private String soyadi;

    private String subesi;

    private Long hesapNo;

    private String ibanNo;

    private Double hesapTutari;

    public Yatirimci() {
        System.out.println("Yatırımcı oluşturuldu, parametresiz");
    }


    public Yatirimci(String adi, String soyadi, String subesi,
                     Long hesapNo, String ibanNo, Double hesapTutari) {

        this.adi = adi;
        this.soyadi = soyadi;
        this.subesi = subesi;
        this.hesapNo = hesapNo;
        this.ibanNo = ibanNo;
        this.hesapTutari = hesapTutari;
        System.out.println("Yatırımcı oluşturuldu, tüm parametreler var");
    }


    public Yatirimci(String adi, String soyadi) {
        this.adi = adi;
        this.soyadi = soyadi;

        System.out.println("Yatırımcı oluşturuldu ancak sadece ad ve soyad var");
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    public Long getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(Long hesapNo) {
        this.hesapNo = hesapNo;
    }

    public String getIbanNo() {
        return ibanNo;
    }

    public void setIbanNo(String ibanNo) {
        this.ibanNo = ibanNo;
    }

    public Double getHesapTutari() {
        return hesapTutari;
    }

    public void setHesapTutari(Double hesapTutari) {
        this.hesapTutari = hesapTutari;
    }


    public void bilgisiniVer() {

        System.out.println("Yatırımcı bilgi metodu çağırıldı");
    }




    @Override
    public String toString() {
        return new StringJoiner(", ", Yatirimci.class.getSimpleName() + "[", "]")
                .add("adi=" + adi)
                .add("soyadi=" + soyadi)
                .add("subesi=" + subesi)
                .add("hesapNo=" + hesapNo)
                .add("ibanNo=" + ibanNo)
                .add("hesapTutari=" + hesapTutari)
                .toString();
    }


}
