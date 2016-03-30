package com.zhy.DesignPattern.Prototype;

public class ShallowStudent extends AbstractStudent {

	@Override
	public AbstractStudent Clone() {
		
		ShallowStudent student = new ShallowStudent();
		student.setName(super.name);
		student.setAge(super.age);
		student.setCourse(super.course);
		return student;
	}
}
