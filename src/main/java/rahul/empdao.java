package rahul;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public  class empdao 
{
	private static SessionFactory fact;
	private static Session sess;
	private static Transaction t;
	
	static
	{
 fact = new Configuration().configure().buildSessionFactory();
		 sess = fact.openSession();
		 t = sess.getTransaction();
	}
	
	public static void add(employee emp)
	{
		t.begin();
		sess.save(emp);
		t.commit();
		
		
	}
	
	public static void delete(int emp)
	{
		employee em = sess.get(employee.class, emp);
		t.begin();
		sess.delete(em);
		t.commit();
	}
	public static List<employee> show()
	{
		Query<employee> q = sess.createQuery("from employee");
		List<employee> l = q.getResultList();
		return l;
		
	}
	public static employee search(int id)
	{
		employee emp = sess.get(employee.class, id);
		return emp;
		
	}
	
	

}
