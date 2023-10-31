package com.jsp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="identity_info")
public class Bi_Identity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="identity_name")
	private String iname;
	@Column(name="identity num")
	private long num;
	@OneToOne
	private Bi_Person bi_person;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public Bi_Person getBi_person() {
		return bi_person;
	}
	public void setBi_person(Bi_Person bi_person) {
		this.bi_person = bi_person;
	}
	
	
	
	
	

}
