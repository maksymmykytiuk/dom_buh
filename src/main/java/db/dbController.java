package db;

import org.hibernate.Query;
import org.hibernate.Session;
import persistence.HibernateUtil;

import static security.GeneratePassword.*;

/**
 * Created by maksy on 30-Jul-16.
 */
public class dbController {
    public static boolean passwordAuthentication(String iPassword, String login) {
        return comparePassword(generatedSecuredPasswordHash(iPassword), getUserPassword(login));
    }

    public static String getUserPassword(String login) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "SELECT u.password FROM UserEntity u WHERE u.login = :login";
        Query query = session.createQuery(hql);
        query.setParameter("login",login);
        session.getTransaction().commit();
        return query.list().toString();
    }
}
