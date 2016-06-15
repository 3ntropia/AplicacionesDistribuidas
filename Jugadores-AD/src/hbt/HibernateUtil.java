package hbt;

import entities.ClubBean;
import entities.JugadorBean;
import entities.JugadorId;
import entities.PartidoBean;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil
{
    private static final SessionFactory sessionFactory;
    static
    {
        try
        {
            AnnotationConfiguration config = new AnnotationConfiguration();
            config.addAnnotatedClass(ClubBean.class);
            config.addAnnotatedClass(JugadorBean.class);
            config.addAnnotatedClass(JugadorId.class);
            config.addAnnotatedClass(PartidoBean.class);
            sessionFactory = config.buildSessionFactory();
        }
        catch (Throwable ex)
        {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}
