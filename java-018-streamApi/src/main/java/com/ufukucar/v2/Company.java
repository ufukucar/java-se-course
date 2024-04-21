package com.ufukucar.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

    /**
        class Product {

            private int id;

            private String productName;

            private Float price;


            public Product(int id, String productName, Float price) {
                this.id = id;
                this.productName = productName;
                this.price = price;
            }
        }

    */


    public static void main(String[] args) {


        List <Product> productsList = new ArrayList<Product>();

        productsList.add(new Product(1, "Ekmek", 10.0));
        productsList.add(new Product(2, "Süt", 8.1));
        productsList.add(new Product(3, "Su", 3.0));
        productsList.add(new Product(4, "Yağ", 3.3));
        productsList.add(new Product(5, "Bisküvi", 3.4));
        productsList.add(new Product(6, "Kola", 5.5));
        productsList.add(new Product(7, "Gofret", 6.7));

        // TODO toplam sonucu elde edin lutfen. Reduce ile de toplamını yap!
        List <Product> productsList2 = productsList
                .stream()
                .filter(p -> p.getPrice() > 5)
                .limit(3)
                //.mapToDouble(value -> Double.doubleValue(value)).sum()
                //.reduce(0, (subtotal, element) -> subtotal + element)
                .collect(Collectors.toList());

        double toplam = productsList
                .stream()
                .filter(p -> p.getPrice() > 5)
                //.limit(3)
                //.mapToDouble(Product::getPrice)
                //.sum();
                .map(Product::getPrice) // Ürünlerin fiyatlarını al
                .reduce(0.0, (acc, total) -> acc + total); // Fiyatları topla



        System.out.println("Toplam: " + toplam);

        System.out.println(productsList2);

    }


}
