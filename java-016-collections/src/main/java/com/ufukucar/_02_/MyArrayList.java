package com.ufukucar._02_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) {

        List <String> listStudent = new ArrayList<>();

        listStudent.add("Uğur");
        listStudent.add("Kürşat");
        listStudent.add("Mustafa");
        listStudent.add("Abdullah");
        listStudent.add("Burak");

        //Collections.sort(listStudent);
        //listStudent.reversed();

        // Collections.sort(listStudent, Collections.reverseOrder()); // Tersten sırala

        for ( String student : listStudent ) {
            System.out.print(student + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        for (int i = 0; i < listStudent.size(); i++) {
            System.out.print(listStudent.get(i) + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------");

        listStudent.forEach(student -> System.out.println(student));

        System.out.println("-----------------------------------");


        System.out.println("============ ITERATOR ============");
        Iterator <String> iterator = listStudent.iterator();

        String searchName;
        while (iterator.hasNext() ) {
            searchName = iterator.next();
            if ( searchName.equals("Mustafa") || searchName.equals("Uğur") ) {
                System.out.println("Bulundu");
                iterator.remove();

            }
        }
        System.out.println(listStudent);

        System.out.println("-----------------------------------");









    }



}
