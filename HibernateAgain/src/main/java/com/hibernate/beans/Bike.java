package com.hibernate.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bId;
	
	@Column(name="bike_name")
	private String bikeName;
	@ManyToOne
	private Person per;
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public Bike(int bId, String bikeName, Person per) {
		super();
		this.bId = bId;
		this.bikeName = bikeName;
		this.per = per;
	}
	public Bike(String bikeName, Person per) {
		super();
		this.bikeName = bikeName;
		this.per = per;
	}
	public Bike() {
		super();
	}
	@Override
	public String toString() {
		return "Bike [bId=" + bId + ", bikeName=" + bikeName + ", per=" + per + "]";
	}
	
	

}
