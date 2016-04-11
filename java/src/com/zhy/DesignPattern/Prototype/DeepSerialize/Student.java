package com.zhy.DesignPattern.Prototype.DeepSerialize;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.zhy.DesignPattern.Prototype.AbstractStudent;
import com.zhy.DesignPattern.Prototype.Course;

public class Student extends AbstractStudent implements Serializable {

	private static final long serialVersionUID = 1L; 
    
	@Override
	public AbstractStudent Clone() {

		Object o = null;
		try
		{
			// 将对象写到流里
			ByteArrayOutputStream bo = new ByteArrayOutputStream();
	        ObjectOutputStream oo = new ObjectOutputStream(bo);
	        oo.writeObject(this);
	        
	        // 从流里读出来
	        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
	        ObjectInputStream oi = new ObjectInputStream(bi);
	        o = oi.readObject();
	        
	        oi.close();
	        bi.close();
	        oo.close();
	        bo.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
        return (AbstractStudent)o;
	}
}