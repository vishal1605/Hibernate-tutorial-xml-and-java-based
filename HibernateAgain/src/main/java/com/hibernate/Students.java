package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "students_details")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	private Date date;

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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Students(int id, String name, String city, String lastName, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.lastName = lastName;
		this.date = date;
	}

	public Students(String name, String city, String lastName, Date date) {
		super();
		this.name = name;
		this.city = city;
		this.lastName = lastName;
		this.date = date;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", lastName=" + lastName + ", date=" + date
				+ "]";
	}

		
}
