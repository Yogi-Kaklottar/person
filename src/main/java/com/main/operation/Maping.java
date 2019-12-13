package com.main.operation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.main.java.Address;
import com.main.java.Department;
import com.main.java.Employee;
import com.main.java.Laptop;
import com.main.java.Phone;

public class Maping {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PERSISTENCE_UNIT_NAME");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		/*
		 * Laptop l1=new Laptop(); Laptop l2=new Laptop(); Laptop l3=new Laptop();
		 * 
		 * l1.setLname("HP"); l2.setLname("Lenovo"); l3.setLname("Dell");
		 * 
		 * 
		 * Employee e1=new Employee(); Employee e2=new Employee(); Employee e3=new
		 * Employee();
		 * 
		 * 
		 * Address a1=new Address(); Address a2=new Address(); Address a3=new Address();
		 * a1.setCity("Bhruch"); a1.setState("gujarat"); a1.setVillage("amroli");
		 * 
		 * a2.setCity("vadodara"); a2.setState("gujarat"); a2.setVillage("valol");
		 * 
		 * 
		 * a3.setCity("vapi"); a3.setState("gujarat"); a3.setVillage("selvasa");
		 * 
		 * Phone p1=new Phone(); Phone p2=new Phone(); Phone p3=new Phone(); Phone
		 * p4=new Phone(); Phone p5=new Phone(); Phone p6=new Phone();
		 * 
		 * p1.setPhno("9876543633"); p2.setPhno("3467890087"); p3.setPhno("4589203873");
		 * p4.setPhno("9876557444"); p5.setPhno("5638878346"); p6.setPhno("7823654237");
		 * 
		 * 
		 * List<Phone> ps1=new ArrayList<>(); ps1.add(p1); ps1.add(p2);
		 * 
		 * List<Phone> ps2=new ArrayList<>(); ps2.add(p3); ps2.add(p4);
		 * 
		 * List<Phone> ps3=new ArrayList<>(); ps3.add(p5); ps3.add(p6);
		 * 
		 * Department d1=new Department(); d1.setDname("production");
		 * 
		 * 
		 * Set<Laptop> ls1=new HashSet<>(); ls1.add(l1); ls1.add(l2); ls1.add(l3);
		 * 
		 * Set<Laptop> ls2=new HashSet<>(); ls2.add(l3); ls2.add(l1); ls2.add(l2);
		 * 
		 * Set<Laptop> ls3=new HashSet<>(); ls3.add(l2); ls3.add(l3); ls3.add(l1);
		 * 
		 * e1.setA(a1); e1.setEname("ramesh"); e1.setL(ls1); e1.setD(d1);
		 * e1.setPhno(ps1); e2.setA(a2); e2.setEname("bhavesh"); e2.setL(ls2);
		 * 
		 * e2.setD(d1); e2.setPhno(ps2); e3.setA(a3); e3.setEname("kamalesh");
		 * e3.setL(ls3); e3.setD(d1); e3.setPhno(ps3);
		 * 
		 * /*Set<Employee> es1=new HashSet(); es1.add(e1); es1.add(e2); es1.add(e3);
		 * 
		 * Set<Employee> es2=new HashSet(); es2.add(e3); es2.add(e1); es2.add(e2);
		 * 
		 * Set<Employee> es3=new HashSet(); es3.add(e2); es3.add(e1); es3.add(e3);
		 * 
		 * l1.setE(es1); l2.setE(es2); l3.setE(es3);
		 * 
		 * //department em.persist(d1);
		 * 
		 * //address em.persist(a1); em.persist(a2); em.persist(a3);
		 * 
		 * //laptop
		 * 
		 * em.persist(l1); em.persist(l2); em.persist(l3);
		 * 
		 * //phone
		 * 
		 * em.persist(p1); em.persist(p2); em.persist(p3); em.persist(p4);
		 * em.persist(p5); em.persist(p6);
		 * 
		 * //Employee
		 * 
		 * em.persist(e1); em.persist(e2); em.persist(e3);
		 */
		Laptop laptop = new Laptop();
		laptop.setLname("Hp");

		Set<Laptop> laptopSet = new HashSet<>();
		laptopSet.add(laptop);
		
		
		Address address1 = new Address();
		address1.setCity("surat");
		address1.setState("gujarat");
		address1.setVillage("amroli");

		Phone phone = new Phone();
		Phone phone2 = new Phone();

		phone.setPhno("9876543633");
		phone2.setPhno("3467890087");
		List<Phone> ps1 = new ArrayList<>();
		ps1.add(phone);
		ps1.add(phone2);
		Department d = new Department();
		d.setDname("hr");

		Employee e1 = new Employee();
		e1.setA(address1);
		e1.setD(d);
		e1.setEname("haresh");
		e1.setPhno(ps1);
		e1.setL(laptopSet);
		
		em.persist(laptop);
		em.persist(e1);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
