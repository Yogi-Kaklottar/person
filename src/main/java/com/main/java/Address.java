package com.main.java;

import javax.persistence.*;

@Entity
public class Address {
			
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	private String city;
	
	private String village;
	
	private String state;

	public Address() {
		super();
		
	}

	public Address(int aid, String city, String village, String state) {
		super();
		this.aid = aid;
		this.city = city;
		this.village = village;
		this.state = state;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [getAid()=" + getAid() + ", getCity()=" + getCity() + ", getVillage()=" + getVillage()
				+ ", getState()=" + getState() + "]";
	}
	
	
	
	
	
}
