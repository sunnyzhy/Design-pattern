package com.zhy.DesignPattern.Prototype;

import java.io.Serializable;

public abstract class AbstractStudent implements Serializable {
	
	private static final long serialVersionUID = 3L; 
	
    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Course course;
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public abstract AbstractStudent Clone();
}
