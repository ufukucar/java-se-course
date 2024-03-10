package com.ufukucar._07_;

import java.util.*;

public class MyMap {

    public static void main(String[] args) {


        /** Key - Value */


        Map mapList = new HashMap<>();

        mapList.put("Ankara", "06");
        mapList.put("İzmir", "35");
        mapList.put("İstanbul", "34");
        mapList.put("Trabzon", "61");
        mapList.put("Ağrı", null);
        mapList.put(null, null);

        System.out.println("HASHMAP: " + mapList);
        System.out.println("------------------------------");


        /** Girilen sıra önemli **/
        Map<String, String> mapList2 = new LinkedHashMap<>();

        mapList2.put("Ankara", "06");
        mapList2.put("İzmir", "35");
        mapList2.put("İstanbul", "34");
        mapList2.put("Trabzon", "61");
        mapList2.put("Ağrı", null);
        mapList2.put(null, null);


        System.out.println("LINKEDHASHMAP: " + mapList2);
        System.out.println("------------------------------");

        /** Key null olmaz, Sıralama vardır, anahtara göre sıralar */
        Map<String, String> mapList3 = new TreeMap<>();

        mapList3.put("Ankara", "06");
        mapList3.put("Ankara", "06");
        mapList3.put("Ankara", "06");
        mapList3.put("İzmir", "35");
        mapList3.put("İstanbul", "34");
        mapList3.put("Trabzon", "61");
        mapList3.put("Ağrı", null);

        mapList3.remove("Ağrı");

        System.out.println("TREE MAP: " + mapList3);
        System.out.println("------------------------------");


        for ( String anahtar : mapList3.keySet() ) {
            System.out.println(anahtar);
        }

        System.out.println("------------------------------");

        for ( String deger : mapList3.values() ) {
            System.out.println(deger);
        }

        System.out.println("------------------------------");

        for ( String anahtar : mapList3.keySet() ) {
            System.out.println(anahtar + " " + mapList3.get(anahtar));
        }

        System.out.println("------------------------------");


        /** key ya da value hiçbiri null olamaz */
        Map mapList4 = new Hashtable();

        mapList4.put("Ankara", "06");
        mapList4.put("İzmir", "35");
        mapList4.put("İstanbul", "34");
        mapList4.put("Trabzon", "61");

        System.out.println("HASH TABLE: " + mapList4);
        System.out.println("------------------------------");


        // TODO sort yapılacak
        // A'dan Z'ye ya da Z'den A'ya
        // 0-9









    }


}
