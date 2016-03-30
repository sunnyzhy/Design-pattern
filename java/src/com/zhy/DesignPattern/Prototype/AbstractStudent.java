package com.zhy.DesignPattern.Prototype;

public abstract class AbstractStudent {

    public String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    public Course course;
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public abstract AbstractStudent Clone();
}
