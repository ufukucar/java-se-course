package com.ufukucar;


import com.ufukucar.entity.Employee;
import com.ufukucar.entity.Owner;
import com.ufukucar.entity.Person;
import com.ufukucar.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstname("Abdullan");
        person.setLastname("Demirel");
        person.setPersonId(1L);

        Employee employee = new Employee();
        employee.setFirstname("Oğuz");
        employee.setLastname("Akkaya");
        employee.setDepartmentName("Marketing");
        employee.setJoiningDate(new Date());
        employee.setPersonId(2L);

        Owner owner = new Owner();
        owner.setFirstname("Sadık");
        owner.setLastname("Kuzu");
        owner.setStocks(300L);
        owner.setPersonId(3L);


        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();



        session.save(person);

        session.save(employee);

        session.save(owner);


        session.getTransaction().commit();
        session.close();
    }
}