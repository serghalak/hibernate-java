package com.dmdev;

import com.dmdev.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateRunner {

    public static void main(String[] args) {
        System.out.println("Hello hibernate!!!");
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//
//        try ( SessionFactory sessionFactory = configuration.buildSessionFactory();
//              Session session = sessionFactory.openSession()) {
//            System.out.println("Session (as a wrapper about connection in jdbc) is created");
//        }
        useEntityManagerWithHibernate();
    }

    private static void useEntityManagerWithHibernate() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        final Student student = em.find(Student.class, 101L);
        System.out.println(student);
        em.getTransaction().commit();
    }


}
