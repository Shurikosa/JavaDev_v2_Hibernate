package repositories;

import entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class ClientRepository {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void persist(Client client){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(client);
            tx.commit();
        }
    }
    public Client getById(Long id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Client.class, id);
        }
    }
    public void merge(Client client){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.merge(client);
            tx.commit();
        }
    }
    public void remove(Client client){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.remove(client);
            tx.commit();
        }
    }
}
