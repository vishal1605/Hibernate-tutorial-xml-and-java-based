package com.hibernate.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	@OneToMany(mappedBy = "per",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Bike> bikes;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Bike> getBikes() {
		return bikes;
	}
	public void setBikes(List<Bike> bikes) {
		this.bikes = bikes;
	}
	public Person(String name, String city, List<Bike> bikes) {
		super();
		this.name = name;
		this.city = city;
		this.bikes = bikes;
	}
	public Person(int id, String name, String city, List<Bike> bikes) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.bikes = bikes;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", bikes=" + bikes + "]";
	}
	
		
	

}
