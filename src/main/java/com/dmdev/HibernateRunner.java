package com.dmdev;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {

    public static void main(String[] args) {
        System.out.println("Hello hibernate!!!");
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        try ( SessionFactory sessionFactory = configuration.buildSessionFactory();
              Session session = sessionFactory.openSession()) {
            System.out.println("Session (as a wrapper about connection in jdbc) is created");
        }
    }
}
