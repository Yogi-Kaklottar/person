package com.main.java;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {

	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int lid;
		
		private String Lname;
		
//		@ManyToMany(mappedBy = "Laptop")
//		private Set<Employee> employee;

		public Laptop() {
			super();
			
		}

		public Laptop(int lid, String lname) {
			super();
			this.lid = lid;
			Lname = lname;
//			this.employee = e;
		}

		public int getLid() {
			return lid;
		}

		public void setLid(int lid) {
			this.lid = lid;
		}

		public String getLname() {
			return Lname;
		}

		public void setLname(String lname) {
			Lname = lname;
		}

//		public Set<Employee> getE() {
//			return employee;
//		}
//
//		public void setE(Set<Employee> e) {
//			
//			this.employee= e;
//		}

		@Override
		public String toString() {
			return "Laptop [getLid()=" + getLid() + ", getLname()=" + getLname() + ", getE()=" 
//		+ getE() 
		+ "]";
		}
		
		
}
