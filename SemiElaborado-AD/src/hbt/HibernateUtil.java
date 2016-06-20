package hbt;

import entities.ElaboradoBean;
import entities.MateriaPrimaBean;
import entities.ProductoBean;
import entities.SemiElaboradoBean;
import entities.UnidadBean;

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
            config.addAnnotatedClass(ElaboradoBean.class);
            config.addAnnotatedClass(MateriaPrimaBean.class);
            config.addAnnotatedClass(ProductoBean.class);
            config.addAnnotatedClass(SemiElaboradoBean.class);
            config.addAnnotatedClass(UnidadBean.class);
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
