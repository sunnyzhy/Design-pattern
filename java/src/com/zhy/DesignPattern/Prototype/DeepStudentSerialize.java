package com.zhy.DesignPattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepStudentSerialize implements Cloneable,Serializable {

	private static final long serialVersionUID = 1L; 
	
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
    
	@Override
	public Object clone() throws CloneNotSupportedException {

		Object value = null;
		try
		{
			// 将对象写到流里
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
	        ObjectOutputStream oo = new ObjectOutputStream(bo);
	        oo.writeObject(this);
	        
	        // 从流里读出来
	        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
	        ObjectInputStream oi = new ObjectInputStream(bi);
	        value = oi.readObject();
	        
	        oi.close();
	        bi.close();
	        oo.close();
	        bo.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
        return value;
	}
}