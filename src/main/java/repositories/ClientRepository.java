package repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utils.HibernateUtil;

public class ClientRepository {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
}
