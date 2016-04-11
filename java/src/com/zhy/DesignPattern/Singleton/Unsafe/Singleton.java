package com.zhy.DesignPattern.Singleton.Unsafe;


public class Singleton {

    private static Singleton instance;

    private Singleton() 
    { 

    }

    public static Singleton GetInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public void Print()
    {
        System.out.println("非线程安全的单例模式.");
    }
}