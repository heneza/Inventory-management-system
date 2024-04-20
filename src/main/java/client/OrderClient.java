package client;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OrderClient {
    public SessionFactory sessionFactory =
            buildSessionFactory();

    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactory(){
        try{
            return new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

        }catch (ExceptionInInitializerError eiie){
            System.out.println(eiie.getLocalizedMessage());
            throw new ExceptionInInitializerError();
        }
    }
}

