package com.zhy.DesignPattern.Flyweight;


public class Course extends AbstractCourse {

	private String name;
	private int periods;

	public Course(String name,int periods)
	{
		this.name = name;
		this.periods = periods;
	}
	
	@Override
	public void Print(Student student) {
		// TODO Auto-generated method stub
		System.out.println(student.getName() + ":\t" + this.name + "(" + this.periods + "¿ÎÊ±)");
	}
}
