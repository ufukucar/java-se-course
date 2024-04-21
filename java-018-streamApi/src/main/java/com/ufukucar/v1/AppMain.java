package com.ufukucar.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AppMain {

    public static void main(String[] args) {

        /** Stream tek kullanımlıktır .*/

        Stream <String> bosKayit = Stream.empty();
        System.out.println(bosKayit);
        System.out.println("--------------------------------");


        Stream <String> tekKayit = Stream.of("Ramazan");
        System.out.println(tekKayit);
        System.out.println("--------------------------------");

        Stream <String> cokluKayit = Stream.of("Ramazan", "İlyas", "Emre", "Eyüp");
        System.out.println(cokluKayit);
        System.out.println("--------------------------------");

        //List <String> ogrenciListsi = new ArrayList<>();
        List <String> ogrenciListsi = List.of("Ramazan", "İlyas", "Emre", "Eyüp");
        System.out.println("Ogrenci Listesi: " + ogrenciListsi);

        // Listeyi stream e cevirdik. En çok bu kullanılır.
        Stream <String> ogrencilerStream = ogrenciListsi.stream();
        //ogrencilerStream.forEach(System.out::println); // lamda ifadesi ile listeyi tek tek yazdırdık

        ogrencilerStream.forEach(ogrenci -> System.out.println(ogrenci));

        System.out.println("--------------------------------");

        var kelimeDizisi = new String[] {"Barış", "İbrahim", "Hasan", "Dilşat", "Seren", "Emre"};

        for ( String kelime: kelimeDizisi )  {
            System.out.println(kelime);
        }
        System.out.println("--------------------------------");






    }
}