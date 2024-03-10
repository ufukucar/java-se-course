package com.ufukucar._01_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {


    public static void main(String[] args) {


        List<Integer> liste1;
        List<String> liste2;
        List<String> liste3;

        liste1 = new ArrayList<>();
        liste2 = new ArrayList<>();
        liste3 = new ArrayList<>();

        liste1.add(10);
        liste1.add(15);
        liste1.add(20);
        liste1.add(7);
        liste1.add(7);
        liste1.add(7);
        liste1.add(null); // Buraya DİKKAT!!!!
        //liste1.remove(1);

        System.out.println("Liste1 elemanları: " + liste1);
        System.out.println("-----------------------------");

        liste2.add("Burak");
        liste2.add("Emre");
        liste2.add("Uğur");
        liste2.add("Emre");
        liste2.add("Emre");
        liste2.add(null);

        liste2.addFirst("Kürşat");
        liste2.add(1, "Batıkan");
        liste2.addLast("Osman");

        System.out.println("Liste2 elemanları: " + liste2);
        System.out.println("-----------------------------");

        System.out.println("Liste1 içinde arama: " + liste1.contains(20));
        System.out.println("Liste2 içinde arama: " + liste2.contains("Öykü"));
        System.out.println("Liste2 içinde arama: " + liste2.contains("Emre"));

        System.out.println("-----------------------------");

        liste3.add("Burak");
        liste3.add("Emre");
        liste3.add("Uğur");
        liste3.add("Emre");
        liste3.add("Emre");
        liste3.add(null);


        System.out.println("Liste 2 ve Liste 3 eşit mi? (equals) => " + liste2.equals(liste3));
        System.out.println("-----------------------------");
        System.out.println("Liste 2 ve Liste 3 eşit mi? (==) => " + (liste2 == liste3));
        System.out.println("-----------------------------");

        System.out.println("Liste1 boyutu: " + liste1.size());
        System.out.println("Liste2 boyutu: " + liste2.size());
        System.out.println("Liste3 boyutu: " + liste3.size());
        System.out.println("-----------------------------");

        List<String> liste4 = new ArrayList<>();

        System.out.println("Liste1 boyutu: " + liste1.size());
        System.out.println("Liste2 boyutu: " + liste2.size());
        System.out.println("Liste3 boyutu: " + liste3.size());
        System.out.println("Liste4 boyutu: " + liste4.size());
        System.out.println("-----------------------------");

        System.out.println("Liste1 boş mu: " + liste1.isEmpty());
        System.out.println("Liste2 boş mu: " + liste2.isEmpty());
        System.out.println("Liste3 boş mu: " + liste3.isEmpty());
        System.out.println("Liste4 boş mu: " + liste4.isEmpty());
        System.out.println("-----------------------------");

        System.out.println("Liste1 boş mu: " + !liste1.isEmpty());
        System.out.println("Liste2 boş mu: " + !liste2.isEmpty());
        System.out.println("Liste3 boş mu: " + !liste3.isEmpty());
        System.out.println("Liste4 boş mu: " + !liste4.isEmpty());
        System.out.println("-----------------------------");

        liste3.add("Abdullah");
        liste3.add("Kaan");
        liste3.add("Öykü");
        liste3.add("Kürşat");
        liste3.add("Emre");
        System.out.println("Liste3 elemanları: " + liste3);
        System.out.println("-----------------------------");

        System.out.println("Liste2 size: " + liste2.size());
        System.out.println("Liste3 size: " + liste3.size());
        liste3.removeAll(liste2);
        System.out.println("Liste3 - liste2 Farkı: " + liste3);
        System.out.println("-----------------------------");


        System.out.println("HASH Code: " + liste1.hashCode());
        System.out.println("HASH Code: " + liste2.hashCode());
        System.out.println("HASH Code: " + liste3.hashCode());
        System.out.println("HASH Code: " + liste4.hashCode());
        System.out.println("-----------------------------");

        // liste3.add(15, "Barış"); // Hata verir. IndexOutOfBounds
        liste4.add("Gözde");
        liste4.add("Dilşat");
        System.out.println("HASH Code: " + liste1.hashCode());
        System.out.println("HASH Code: " + liste2.hashCode());
        System.out.println("HASH Code: " + liste3.hashCode());
        System.out.println("HASH Code: " + liste4.hashCode());
        System.out.println("-----------------------------");


        liste4.remove(1);
        System.out.println("Liste4 1. kayıt silindi! Kalan " + liste4);
        System.out.println("-----------------------------");

        liste4.clear();
        System.out.println("Liste4 tümü silindi " + liste4);
        System.out.println("-----------------------------");







    }


}
