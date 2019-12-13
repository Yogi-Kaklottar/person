package com.main.java;

import javax.persistence.*;

@Entity
public class Phone {

	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int pid;
		
		private String phno;

		public Phone() {
			super();
			
		}

		public Phone(int pid, String phno) {
			super();
			this.pid = pid;
			this.phno = phno;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPhno() {
			return phno;
		}

		public void setPhno(String phno) {
			this.phno = phno;
		}

		@Override
		public String toString() {
			return "Phone [getPid()=" + getPid() + ", getPhno()=" + getPhno() + "]";
		}
		
		
}
