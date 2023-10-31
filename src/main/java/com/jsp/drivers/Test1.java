package com.jsp.drivers;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.entities.Bi_Identity;
import com.jsp.entities.Bi_Person;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bi_Person p = new Bi_Person();
		p.setName("Rahul");
		p.setAge(22);
		p.setLoc("Mysore");
		
		
		Bi_Identity i = new Bi_Identity();
		i.setIname("Aadhar");
		i.setNum(887638378);
		
		p.setBi_identity(i);
		i.setBi_person(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(p);
		em.persist(i);
		et.commit();

	}

}
