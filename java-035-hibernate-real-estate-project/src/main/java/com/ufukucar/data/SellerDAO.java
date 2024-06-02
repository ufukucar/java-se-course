package com.ufukucar.data;

import com.ufukucar.model.Buyer;
import com.ufukucar.model.Seller;
import com.ufukucar.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {


    public static void saveOrUpdateSeller(Seller _seller) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(_seller);

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


    public static Seller getSellerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.get(Seller.class, id);

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public static List<Seller> getSellersFindAll() {


        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.createQuery("from Seller").list();

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }


    }


    public boolean deleteSellerFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Seller seller = session.get( Seller.class, id );

            if ( seller != null ) {

                session.delete(seller);
                System.out.println("Successfully deleted Seller");
                transaction.commit();

                return true;

            }else {
                System.out.println("Seller not found");
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
