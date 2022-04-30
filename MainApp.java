package com.ashwini;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainApp {

	public static void main(String[] args) {
    
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu1");
		EntityManager em=emf.createEntityManager();
		JpaEmployee eob=new JpaEmployee();
		em.getTransaction().begin();
		/*eob.setEid(112);
		eob.setEname("shree");
		em.persist(eob);//save the record// insert into table name
		em.getTransaction().commit();
		System.out.println("Saved");*/
		
		JpaEmployee eob1=em.find(JpaEmployee.class,111);
		System.out.println(eob1);
		


	}

}
