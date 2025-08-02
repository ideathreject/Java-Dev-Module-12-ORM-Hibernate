package com.goit.ORM_Hibernate.daoImpl;

import com.goit.ORM_Hibernate.daoServices.PlanetDao;
import com.goit.ORM_Hibernate.entity.Planet;
import com.goit.ORM_Hibernate.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PlanetDaoImpl implements PlanetDao {

    @Override
    public void save(Planet planet) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(planet);
            tx.commit();
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
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(planet);
            tx.commit();
        }
    }

    @Override
    public void deleteById(String id) {
        try (Session session = HibernateUtil.getInstance().getSessionFactory().openSession()) {
            Transaction tx = session.beginTransaction();
            Planet planet = session.get(Planet.class, id);
            if (planet != null) {
                session.remove(planet);
            }
            tx.commit();
        }
    }
}