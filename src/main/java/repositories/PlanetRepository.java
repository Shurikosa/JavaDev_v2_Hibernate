package repositories;

import entities.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class PlanetRepository {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void save(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.save(planet);
            tx.commit();
        }
    }
    public Planet findById(Long id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Planet.class, id);
        }
    }
    public void update(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.update(planet);
            tx.commit();
        }
    }
    public void delete(Planet planet){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.delete(planet);
            tx.commit();
        }
    }
}
