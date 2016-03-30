package com.zhy.DesignPattern.Singleton;

public final class SafeLockSingleton {

	private static SafeLockSingleton instance;

    private SafeLockSingleton()
    {

    }

    public static synchronized SafeLockSingleton GetInstance()
    {
    	if (instance == null)
    	{
    		instance = new SafeLockSingleton();
    	}
        return instance;
    }

    public void Print()
    {
        System.out.println("线程安全的单例模式.");
    }
}
