package repositories;

import entities.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class TicketRepository {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void persist(Ticket ticket){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.persist(ticket);
            tx.commit();
        }
    }
    public Ticket getById(Long id){
        try(Session session = sessionFactory.openSession()){
            return session.get(Ticket.class, id);
        }
    }
    public void merge(Ticket ticket){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.merge(ticket);
            tx.commit();
        }
    }
    public void remove(Ticket ticket){
        try(Session session = sessionFactory.openSession()){
            Transaction tx = session.beginTransaction();
            session.remove(ticket);
            tx.commit();
        }
    }
}
