package com.zhy.DesignPattern.Prototype.Shallow;

import com.zhy.DesignPattern.Prototype.AbstractStudent;

public class Student extends AbstractStudent {

	@Override
	public AbstractStudent Clone() {
		
		Student student = new Student();
		student.setName(super.getName());
		student.setAge(super.getAge());
		student.setCourse(super.getCourse());
		return student;
	}
}
