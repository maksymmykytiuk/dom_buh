/**
 * Created by maksy on 25-May-16.
 */
import org.hibernate.Query;
import org.hibernate.Session;
import persistence.HibernateUtil;import java.util.List;

public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        String hql = "SELECT CCE.name FROM CategoryConsumptionEntity CCE WHERE CCE.idCategoryConsumption = :idCategory";
        Query query = session.createQuery(hql);
        query.setParameter("idCategory",2);
        java.util.List results = query.list();

        session.getTransaction().commit();
    }

}