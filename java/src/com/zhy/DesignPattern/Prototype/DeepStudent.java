package com.zhy.DesignPattern.Prototype;

public class DeepStudent extends AbstractStudent
{
	@Override
	public AbstractStudent Clone() {
		
		ShallowStudent student = new ShallowStudent();
		student.setName(super.name);
		student.setAge(super.age);
		student.setCourse(new Course());
		student.course.setName(super.course.getName());
		return student;
	}
}

