package com.ufukucar;

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


    /*
    public Personel() {
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

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Personel.class.getSimpleName() + "[", "]")
                .add("adi='" + adi + "'")
                .add("soyadi='" + soyadi + "'")
                .add("telefonNo='" + telefonNo + "'")
                .add("departmani='" + departmani + "'")
                .add("sicilNo=" + sicilNo)
                .toString();
    }

    */
}
