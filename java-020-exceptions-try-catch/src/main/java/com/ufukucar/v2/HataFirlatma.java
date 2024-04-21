package com.ufukucar.v2;

public class HataFirlatma {


    public static void main(String[] args) {

        try {

            int sonuc = urunlerinSayisiniAlUnchecked(250);
            //int sonuc = urunlerinSayisiniAlChecked(250);

            System.out.println("Ürün sayısı: " + sonuc);

        }catch (Exception e){
            System.out.println("Hata: " + e);
            throw new RuntimeException();
        }finally {
            System.out.println("Teşekkürler.");
        }

    }

    // Unchecked
    private static int urunlerinSayisiniAlUnchecked(int siloNo) {

        int uretileUrunSayisi = 123;


        if ( siloNo < 1 || siloNo > 25 ) {
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz!");
        }else {
            return uretileUrunSayisi;
        }

    }

    // Checked
    private static int urunlerinSayisiniAlChecked(int siloNo) throws Exception {

        int uretileUrunSayisi = 123;


        if ( siloNo < 1 || siloNo > 25 ) {
            throw new ArithmeticException("Silo sayısını lütfen doğru giriniz!");
        }else {
            return uretileUrunSayisi;
        }

    }


}
