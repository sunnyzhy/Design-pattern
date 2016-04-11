package com.zhy.DesignPattern.Prototype.Deep;

import com.zhy.DesignPattern.Prototype.AbstractStudent;
import com.zhy.DesignPattern.Prototype.Course;

public class Student extends AbstractStudent {

	@Override
	public AbstractStudent Clone() {
		
		Student student = new Student();
		student.setName(super.name);
		student.setAge(super.age);
		student.setCourse(new Course());
		student.course.setName(super.course.getName());
		return student;
	}
}
