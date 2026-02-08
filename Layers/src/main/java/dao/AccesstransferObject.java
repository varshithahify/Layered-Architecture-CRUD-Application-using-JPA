package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Pancard;

public class AccesstransferObject {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	//insert
	public void insert(Pancard a) {
		et.begin();
		em.persist(a);
		et.commit();
		System.out.println("The value is inserted");
	}

	
//update
	public void update(int id,String name,long phone) {
		Pancard p=em.find(Pancard.class,id);
		p.setName(name);
		p.setPhone(phone);
		et.begin();
		em.merge(p);
		et.commit();
		System.out.println("The value is updated");
	}
		
		//fetch
		public void fetch(int id) {
			Pancard p=em.find(Pancard.class, id);
			System.out.println("P_id:"+p.getP_id()+" "+"name:"+p.getName()+" "+"phone:"+p.getPhone());
		}
		//delete
		public void delete(int id) {
			Pancard p=em.find(Pancard.class,id);
			et.begin();
			em.remove(p);
			et.commit();
			System.out.println("The value is deleted");
		}
}
	

