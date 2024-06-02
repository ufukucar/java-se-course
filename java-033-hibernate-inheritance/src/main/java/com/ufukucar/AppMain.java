package com.ufukucar;

import com.ufukucar.model.Employee;
import com.ufukucar.model.Owner;
import com.ufukucar.model.Person;
import com.ufukucar.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {
    public static void main(String[] args) {


        Person person = new Person("Steve", "Balmer");
        // person.setPersonId(1L);

        Employee employee = new Employee("James", "Gosling", new Date(), "Marketing");
        //employee.setPersonId(2L);

        Owner owner = new Owner("Bill", "Gates", 300L, 20L);
        // owner.setPersonId(3L);


        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.save(person);
            session.save(employee);
            session.save(owner);

            transaction.commit();

        } catch (HibernateException e) {

        } finally {
            session.close();
        }


    }

}
