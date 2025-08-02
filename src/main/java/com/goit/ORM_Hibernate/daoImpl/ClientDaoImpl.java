package com.goit.ORM_Hibernate.daoImpl;

import com.goit.ORM_Hibernate.daoServices.ClientDao;
import com.goit.ORM_Hibernate.entity.Client;
import com.goit.ORM_Hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDaoImpl implements ClientDao {

    @Override
    public void save(Client client) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(client);
            tx.commit();
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
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(client);
            tx.commit();
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Client client = session.get(Client.class, id);
            if (client != null) {
                session.remove(client);
            }
            tx.commit();
        }
    }
}