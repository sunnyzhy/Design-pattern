package com.zhy.DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class CourseFactory {

	private Map<String,Course> courses = new HashMap<String,Course>();
	
	public Course GetCourse(String name, int periods)
	{
		if(!this.courses.containsKey(name))
		{
			this.courses.put(name, new Course(name,periods));
		}
		return this.courses.get(name);
	}
	
	public int GetCourseCount()
    {
        System.out.println("¿ª¿Î×ÜÊý£º" + this.courses.size());
        return this.courses.size();
    }
}
