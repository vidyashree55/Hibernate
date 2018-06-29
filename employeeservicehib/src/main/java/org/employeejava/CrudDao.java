package org.employeejava;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class CrudDao<E> {
	
	private  Session session;
	
	public CrudDao(Session session) {
		super();
		this.session = session;
	}

	public void add(E e)
	{
		//Session session = HibUtil.getSessionfactory().getCurrentSession();
		session.save(e);
	}
	
	public void update(E e)
	{
		//Session session = HibUtil.getSessionfactory().getCurrentSession();
		session.update(e);
	}
	
	public void delete(E e)
	{
		//Session session = HibUtil.getSessionfactory().getCurrentSession();
		session.delete(e);
	
	}
	
	public List<E> list(Class c)
	{
		 Query query = session.createQuery( "from " +c.getSimpleName());
		  List<E> list = (List<E>) query.list();
		  return list;

	}
	
	
	
	

}
