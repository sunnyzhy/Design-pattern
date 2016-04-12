package com.zhy.DesignPattern.Prototype.Deep;

import com.zhy.DesignPattern.Prototype.AbstractStudent;
import com.zhy.DesignPattern.Prototype.Course;

public class Student extends AbstractStudent {

	@Override
	public AbstractStudent Clone() {
		
		Student student = new Student();
		student.setName(super.getName());
		student.setAge(super.getAge());
		student.setCourse(new Course());
		student.getCourse().setName(super.getCourse().getName());
		return student;
	}
}
