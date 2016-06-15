package hbt;

import entities.*;
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
            config.addAnnotatedClass(ConvenioBean.class);
            config.addAnnotatedClass(ContratoBean.class);
            config.addAnnotatedClass(CoordinadorBean.class);
            config.addAnnotatedClass(DesarrolladorBean.class);
            config.addAnnotatedClass(FuncionBean.class);
            config.addAnnotatedClass(IntegranteBean.class);
            config.addAnnotatedClass(PersistentObjectBean.class);
            config.addAnnotatedClass(ProyectoBean.class);
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
