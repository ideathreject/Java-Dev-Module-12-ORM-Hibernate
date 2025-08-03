package com.goit.ORM_Hibernate.dao;

import com.goit.ORM_Hibernate.entity.Client;
import com.goit.ORM_Hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDaoImpl implements ClientDao {

    @Override
    public void save(Client client) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(client);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }

    @Override
    public Client findById(Long id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            return session.get(Client.class, id);
        }
    }

    @Override
    public List<Client> findAll() {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            return session.createQuery("from Client", Client.class).list();
        }
    }

    @Override
    public void update(Client client) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.merge(client);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }

    @Override
    public void deleteById(Long id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            session.beginTransaction();
            Client client = session.get(Client.class, id);
            if (client != null) {
                session.remove(client);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }
}