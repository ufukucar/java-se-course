package com.ufukucar;

import com.ufukucar.entity.Address;
import com.ufukucar.entity.Customer;
import com.ufukucar.entity.Order;
import com.ufukucar.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kok");

        Address address1 = new Address();
        address1.setCountry("Türkiye");
        address1.setCity("Ankara");
        address1.setStreet("Çankaya");


        Address address2 = new Address();
        address2.setCountry("Türkiye");
        address2.setCity("Ankara");
        address2.setStreet("Etimesgut");

        Address address3 = new Address();
        address3.setCountry("Türkiye");
        address3.setCity("Ankara");
        address3.setStreet("Kızılay");


        Address address4 = new Address();
        address4.setCountry("Türkiye");
        address4.setCity("İzmir");
        address4.setStreet("Buca");


        Address address5 = new Address();
        address5.setCountry("Türkiye");
        address5.setCity("İzmir");
        address5.setStreet("Alaçatı");


        Set<Address> addressSet = new HashSet<>();
        addressSet.addAll(Arrays.asList(address1, address2, address3));
        //customer1.getAddresses().addAll(addressSet);
        // Önce torbayı al, sonra içine ekle. Syntax böyle
        customer1.getAddresses().add(address1);
        customer1.getAddresses().add(address2);
        customer1.getAddresses().add(address3);

        Customer customer2 = new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Karakök");

        customer2.getAddresses().add(address4);
        customer2.getAddresses().add(address5);


        Customer customer3 = new Customer("Atila", "Güneş");



        Session session = HibernateUtil.getSessionFactory().openSession();


        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(customer2);
            session.save(customer3);


            transaction.commit();

        } catch (HibernateException e) {
            transaction.rollback();
            System.out.println("Error: " + e);
        } finally {
            session.close();
        }


    }


}