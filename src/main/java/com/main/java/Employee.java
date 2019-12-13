package com.main.java;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;

	@OneToOne(cascade = CascadeType.ALL)
	private Address a;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Phone> phno;

	@ManyToMany
	private Set<Laptop> l = new HashSet<>();

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Department.class)
	private Department d;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, Address a, List<Phone> phno, Set<Laptop> l) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.a = a;
		this.phno = phno;
		this.l = l;
	}

	public Department getD() {
		return d;
	}

	public void setD(Department d) {
		this.d = d;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	public List<Phone> getPhno() {
		return phno;
	}

	public void setPhno(List<Phone> phno) {
		this.phno = phno;
	}

	public Set<Laptop> getL() {
		return l;
	}

	public void setL(Set<Laptop> l) {
		this.l = l;
	}

}
