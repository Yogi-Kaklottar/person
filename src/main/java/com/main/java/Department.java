package com.main.java;

import javax.persistence.*;

@Entity
public class Department {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	
	private String dname;

	public Department() {
		super();
		
	}

	public Department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [getDid()=" + getDid() + ", getDname()=" + getDname() + "]";
	}
	

}
