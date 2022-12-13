package com.net.Model;

import javax.persistence.OneToOne;

public class Task {
	
	private int id;
	private String name;
	
	@OneToOne(mappedBy = "task")
	private Student student;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
	

}
