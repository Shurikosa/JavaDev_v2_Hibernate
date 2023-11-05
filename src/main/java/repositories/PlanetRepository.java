package repositories;

import entities.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class PlanetRepository {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void persist(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(planet);
            tx.commit();
        }
    }
    public Planet getById(Long id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Planet.class, id);
        }
    }
    public void merge(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.merge(planet);
            tx.commit();
        }
    }
    public void remove(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.remove(planet);
            tx.commit();
        }
    }
}
