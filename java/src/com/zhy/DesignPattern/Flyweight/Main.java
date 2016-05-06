package com.zhy.DesignPattern.Flyweight;

//ÏíÔªÄ£Ê½£¨Flyweight£©
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CourseFactory factory = new CourseFactory();
      Student jim = new Student("Jim");
      Student tom = new Student("Tom");
      Course course1 = factory.GetCourse("Java", 20);
      course1.Print(jim);
      Course course2 = factory.GetCourse("C++", 30);
      course2.Print(jim);
      Course course3 = factory.GetCourse("C#", 10);
      course3.Print(jim);
      Course course4 = factory.GetCourse("Java", 20);
      course4.Print(tom);
      Course course5 = factory.GetCourse("C#", 10);
      course5.Print(tom);
      factory.GetCourseCount();
	}

}
