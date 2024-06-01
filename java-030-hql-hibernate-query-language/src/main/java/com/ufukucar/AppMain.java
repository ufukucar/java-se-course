package com.ufukucar;

import com.ufukucar.entity.Customer;
import com.ufukucar.entity.CustomerDetail;
import com.ufukucar.utils.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class AppMain {

    public static void main(String[] args) {

        Customer customer1 =  new Customer();
        customer1.setFirstName("Adem");
        customer1.setLastName("Kok");
        customer1.setAge(25);

        CustomerDetail customerDetail1 = new CustomerDetail();
        customerDetail1.setAddress("Berlin");
        customerDetail1.setPhoneNumber("11111111");
        customerDetail1.setEmail("abc@gmail.com");
        customerDetail1.setCreateDate(new Date());

        customerDetail1.setCustomer(customer1);
        customer1.setCustomerDetail(customerDetail1);




        Customer customer2 =  new Customer();
        customer2.setFirstName("Tunahan");
        customer2.setLastName("Karakök");
        customer2.setAge(36);

        CustomerDetail customerDetail2 = new CustomerDetail();
        customerDetail2.setAddress("Ankara");
        customerDetail2.setPhoneNumber("9999999");
        customerDetail2.setEmail("ankara06abc@gmail.com");
        customerDetail2.setCreateDate(new Date());

        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);





        Customer customer3 =  new Customer("Atila", "Güneş", 55);
        CustomerDetail customerDetail3 = new CustomerDetail( );
        customerDetail3.setAddress("İzmir");
        customerDetail3.setPhoneNumber("35353535");
        customerDetail3.setEmail("izmir35@gmail.com");
        customerDetail3.setCreateDate(new Date());

        customerDetail3.setCustomer(customer3);
        customer3.setCustomerDetail(customerDetail3);




        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try{
            transaction = session.beginTransaction();

            session.save(customer1);
            session.save(customer2);
            session.save(customer3);


            System.out.println("============== SELECT ================");

            Query query = session.createQuery("FROM Customer");

            List <Customer> customers = query.getResultList();

            for (Customer customer : customers) {
                System.out.println(customer.getCustomerId() + " " + customer.getFirstName() + " " + customer.getLastName());
            }

            System.out.println("============== WHERE ================");

            /*Random rand = new Random();
            int randId =  rand.nextInt(4);*/

            Query query2 = session.createQuery("FROM Customer WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            Customer cust2= (Customer) query2.getSingleResult();
            System.out.println(cust2.getCustomerId() + " " + cust2.getFirstName() + " " + cust2.getLastName());


            System.out.println("============== DELETE ================");

            // FIXME: cascade = CascadeType.ALL yapmaya çalışacak
            Query query3 = session.createQuery("DELETE CustomerDetail WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            int query3Result = query3.executeUpdate();
            System.out.println("CustomerDetail Tablosundsa " + query3Result);

            Query query4 = session.createQuery("DELETE Customer WHERE customerId = :customerId")
                    .setParameter("customerId", 1);

            int query4Result = query4.executeUpdate();

            System.out.println("Customer Tablosundsa " + query4Result);

            System.out.println("======= AVG SUM MIN MAX COUNT ========");

            Query query5 = session.createQuery("SELECT COUNT (*) FROM Customer");
            //Query query5 = session.createQuery("SELECT MIN(age) FROM Customer");

            Long countResult = (Long) query5.getSingleResult();

            System.out.println("COUNT: " + countResult);


            System.out.println("============== JOIN ================");
            Query query6 = session.createQuery("SELECT C.firstName, C.lastName, C.lastName, C.age  FROM Customer C JOIN CustomerDetail D ON C.customerId = D.customerId");

            List <Customer> custList6 = query6.getResultList();

            // FIXME yazdırma için kod geliştirilecek
            /*for (Customer cust6 : custList6) {
                System.out.println(cust6.getFirstName()  + " " + cust6.getLastName() + " " + cust6.getAge() + " - " + cust6.getCustomerDetail().getAddress());
            }*/

            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }




    }


}