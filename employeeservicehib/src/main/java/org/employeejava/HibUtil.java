package org.employeejava;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibUtil {
	
private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

public static SessionFactory getSessionfactory() {
	return sessionFactory;
}


}
