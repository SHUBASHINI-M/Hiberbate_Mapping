package connect;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.login;


public class Connt {

	private static SessionFactory fac;
	public Connt()
	{
		fac=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(login.class).buildSessionFactory();
		
	}
	
	public static SessionFactory getSessionFact()
	{
		Connt c=new Connt();
		return fac;
	}
}