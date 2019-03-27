package com.itsuccesswin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentInfo {
	
	@Id
	@Column(name="Student_ID")
	private int id;
	@Column(name="Student_Name")
	private String name;
	
	@Column(name="Student_Marks")
	private int marks;

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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	

}
