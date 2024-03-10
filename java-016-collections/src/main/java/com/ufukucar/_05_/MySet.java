package com.ufukucar._05_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySet {

    public static void main(String[] args) {

        /** Hashset girilen sıranın önemi yoktur. Kendisi sıralar */
        Set <String> studentList1 = new HashSet<>();
        HashSet <String> studentList2 = new HashSet<>();

        /** Varsayılan olarak sıralama yapar; Türkçe karakterlerde sorunlu **/
        Set <String> studentList3 = new TreeSet<>();
        TreeSet <String> studentList4 = new TreeSet<>();

        /** Girilen sıraya göre atama yapılabilir */
        Set <String> studentList5 = new LinkedHashSet<>();
        LinkedHashSet <String> studentList6 = new LinkedHashSet<>();


        studentList2.add("Abdullah");
        studentList2.add("Fevzi");
        studentList2.add("Furkan");
        studentList2.add("İsmail");
        studentList2.add("Gözde");
        studentList2.add("Veysel");
        studentList2.add("Barış");
        studentList2.add("Öykü");
        studentList2.add("Barış");
        studentList2.add(null);

        System.out.println("HASH SET: " + studentList2);
        System.out.println("------------------------------------------------");

        studentList4.add("Abdullah");
        studentList4.add("Fevzi");
        studentList4.add("İsmail");
        studentList4.add("Furkan");
        studentList4.add("Gözde");
        studentList4.add("Veysel");
        studentList4.add("Barış");
        studentList4.add("Öykü");
        studentList4.add("Barış");
        //studentList4.add(null); // Sıralama yaptığından dolayı hata verir.

        System.out.println("TREE SET: " + studentList4);
        System.out.println("------------------------------------------------");

        studentList5.add("Abdullah");
        studentList5.add("Fevzi");
        studentList5.add("İsmail");
        studentList5.add("Furkan");
        studentList5.add("Gözde");
        studentList5.add("Veysel");
        studentList5.add("Barış");
        studentList5.add("Barış");
        studentList5.add("Öykü");
        studentList5.add("Barış");
        studentList5.add(null);

        System.out.println("LINKEDHASHSET SET: " + studentList5);
        System.out.println("------------------------------------------------");











    }


}
