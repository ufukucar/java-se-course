package com.ufukucar.data;

import com.ufukucar.model.Agent;
import com.ufukucar.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AgentDAO {

    // JPA    Save        Get      Update     Delete
    // CRUD   Create      Read     Update     Delete
    // SQL    Insert      Select   Update     Delete


    /*
    public void save(Agent agent){
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.save(agent);

            transaction.commit();

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
        } finally {
            session.close();
        }
    }

    public void update(Agent agent){

    }
    */

    public void saveOrUpdateAgent(Agent agent) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            session.saveOrUpdate(agent);

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


    public Agent getAgentFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.get(Agent.class, id);

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public List<Agent> getAgentsFindAll() {


        Session session = HibernateUtil.getSessionFactory().openSession();

        try {

            return session.createQuery("from Agent").list();

        } catch (HibernateException e) {
            System.out.println("HATA: " + e.getMessage());
            return null;
        } finally {
            session.close();
        }


    }


    public boolean deleteAgentFindById(Long id) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();

            Agent agent = session.get( Agent.class, id );

            if ( agent != null ) {

                session.delete(agent);
                System.out.println("Successfully deleted agent");
                transaction.commit();

                return true;

            }else {
                System.out.println("Agent not found");
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
