package com.ufukucar.data;

import com.ufukucar.model.Property;
import com.ufukucar.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PropertyDAO {

    public void saveOrUpdateProperty(Property property) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(property);

            transaction.commit();

        } catch (HibernateException e) {
            if ( transaction != null ) {
                transaction.rollback();
            }
            System.out.println("HATA: " + e.getMessage());
        } finally {
            session.close();
        }

    }


    public Property getPropertyFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.get(Property.class, id);

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public List<Property> getPropertysFindAll() {


        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.createQuery("from Property").list();

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }


    }


    public boolean deletePropertyFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Property property = session.get( Property.class, id );

            if ( property != null ) {

                session.delete(property);
                System.out.println("Successfully deleted Property");
                transaction.commit();

                return true;

            }else {
                System.out.println("Property not found");
                return false;
            }


        } catch (HibernateException e) {
            if ( transaction != null ) {
                transaction.rollback();
            }

            System.out.println("HATA: " + e.getMessage());
            return false;

        } finally {
            session.close();
        }



    }


}
