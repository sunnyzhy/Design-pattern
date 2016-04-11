package com.zhy.DesignPattern.Singleton.DoubleLock;


public class Singleton {

	private static Singleton instance;

    private Singleton()
    {

    }

    public static Singleton GetInstance()
    {
        if (instance == null)
        {
        	synchronized (Singleton.class)
            {
                if (instance == null)
                {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void Print()
    {
        System.out.println("双重锁定，线程安全的单例模式.");
    }
}
