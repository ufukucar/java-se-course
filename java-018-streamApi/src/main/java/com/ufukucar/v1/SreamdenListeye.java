package com.ufukucar.v1;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SreamdenListeye {

    public static void main(String[] args) {


        Stream <String> myStream = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");

        // Bu çeviri çok sık kullanılır.
        TreeSet <String> myTreeSet = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(myTreeSet);
        System.out.println("----------------myStream2------------------");

        Stream <String> myStream2 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");
        TreeSet <String> myTreeSet2 = myStream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet2);

        System.out.println("----------------myStream3------------------");

        Stream <String> myStream3 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");

        /*
            myStream3
                .sorted().
                forEach(System.out::println);
        */
        TreeSet <String> myTreeSet3 = myStream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet3);

        System.out.println("---------------myStream4-------------------");

        /** HATA verir. Çünkü stream 3 tek kullanımlıktır. */
       /* TreeSet <String> myTreeSet4 = myStream3.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(myTreeSet4);*/


        Stream <String> myStream4 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Emre", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");
        myStream4
                .sorted()
                .distinct()
                .forEach(System.out::println);


        System.out.println("--------------myStream5--------------------");


        Stream <String> myStream5 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Emre", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");

        myStream5
                .sorted()
                .distinct()
                .filter(isim -> !isim.contains("e"))
                .forEach(System.out::println);


        System.out.println("---------------myStream6-------------------");


        Stream <String> myStream6 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Emre", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");

        myStream6
                .sorted()
                .distinct()
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .forEach(System.out::println);


        System.out.println("---------------myStream7-------------------");

        Stream <String> myStream7 = Stream.of("Barış", "İbrahim", "Emre", "Hasan", "Emre", "Dilşat", "Çağdaş", "Seren", "Emre", "Ülkü");

        HashSet <String> myHashSet7 = myStream7
                .sorted()
                .distinct()
                .filter(isim -> !isim.contains("e") || isim.startsWith("S"))
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(myHashSet7);

        for (String item: myHashSet7) {
            System.out.println(item);
        }

        System.out.println("----------------------------------");

    }


}
