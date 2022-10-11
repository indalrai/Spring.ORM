package com.SpringORM.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_record")
public class Student {

	@Id
	@Column(name="roll")
	private int rollnumber;
	@Column
	private String name;
	@Column
	private String city;
	
	public Student(int rollnumber, String name, String city) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.city = city;
}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
	
	
}
