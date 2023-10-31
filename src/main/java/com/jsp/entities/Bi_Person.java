package com.jsp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person_info")
public class Bi_Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="person_name")
	private String name;
	@Column(name="person_age")
	private int age;
	@Column(name="person_loc")
	private String loc;
	@OneToOne
	private Bi_Identity bi_identity;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Bi_Identity getBi_identity() {
		return bi_identity;
	}
	public void setBi_identity(Bi_Identity bi_identity) {
		this.bi_identity = bi_identity;
	}
	
	
	
	
	
	
	
	
	
	

}
