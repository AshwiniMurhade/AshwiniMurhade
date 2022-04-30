package cycle;



	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.service.ServiceRegistry;
	import org.hibernate.service.ServiceRegistryBuilder;

	public class LaptopMain {

		public static void main(String[] args) {
			MyLaptopClass lob=new MyLaptopClass(); //new State  Transient
			
			Configuration con=new Configuration().configure().addAnnotatedClass(MyLaptopClass.class);
			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			//ServiceRegistry reg1=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			
			SessionFactory sf=con.buildSessionFactory(reg);
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
	        
			/*lob.setLid(111);
			lob.setLname("apple");
			lob.setLprice(900);  //object is in transient state
			
			//session.save(lob);  //persistant state always data is there in database
			//lob.setLprice(750);
			//tx.commit();*/
			
			
			//detach state
			
			/*lob.setLid(113);
			lob.setLname("bell");
			lob.setLprice(800);
			session.save(lob);
			
			tx.commit();//permantaly store
		  session.evict(lob);
			lob.setLprice(850);//not updated in database*/
	          
			//object is in detached state
			
			
		
			//remove state
			lob.setLid(117);
			lob.setLname("Samsung");
			lob.setLprice(700);
			//persistent
			session.save(lob);//insert the table
			tx.commit();
			session.delete(lob); //delete from tablename
		    //tx.commit();
	}

}
