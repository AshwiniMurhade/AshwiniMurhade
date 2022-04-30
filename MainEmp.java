package ashu;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainEmp {

	public static void main(String[] args) {
		Empdemo e1=null;
		//e1.setEid(2);
		//e1.setName("ashu");
		
		Configuration con=new Configuration().configure("empde.cfg.xml").addAnnotatedClass(Empdemo.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory(reg); 
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		  
		//session.save(e1);// insert but how
		//tx.commit();
		//System.out.println("Record saved");
		
		// to fetch data
		e1=(Empdemo)session.get(Empdemo.class,3);
		System.out.println(e1);
		System.out.println("id="+e1.getEid());
		System.out.println("Name="+e1.getName());
		

	}

}