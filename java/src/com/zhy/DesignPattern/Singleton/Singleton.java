package com.zhy.DesignPattern.Singleton;

public final class Singleton {

	private static final Singleton instance = new Singleton();    
	
	private Singleton ()
	{
	    	
	}    
	    
	public static Singleton GetInstance()
	{    
		return instance;    
	}    
	
    public void Print()
    {
        System.out.println("静态初始化，线程安全的单例模式.");
    }
}
