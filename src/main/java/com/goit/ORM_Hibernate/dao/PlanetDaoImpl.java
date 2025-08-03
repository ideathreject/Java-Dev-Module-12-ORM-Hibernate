package com.goit.ORM_Hibernate.dao;

import com.goit.ORM_Hibernate.entity.Planet;
import com.goit.ORM_Hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetDaoImpl implements PlanetDao {

    @Override
    public void save(Planet planet) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(planet);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }

    @Override
    public Planet findById(String id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            return session.get(Planet.class, id);
        }
    }

    @Override
    public List<Planet> findAll() {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            return session.createQuery("from Planet", Planet.class).list();
        }
    }

    @Override
    public void update(Planet planet) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.merge(planet);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }

    @Override
    public void deleteById(String id) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            Planet planet = session.get(Planet.class, id);
            if (planet != null) {
                session.remove(planet);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
        }
    }
}