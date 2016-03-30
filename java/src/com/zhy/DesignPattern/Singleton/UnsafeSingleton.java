package com.zhy.DesignPattern.Singleton;

public final class UnsafeSingleton {

    private static UnsafeSingleton instance;

    private UnsafeSingleton() 
    { 

    }

    public static UnsafeSingleton GetInstance()
    {
        if (instance == null)
        {
            instance = new UnsafeSingleton();
        }
        return instance;
    }

    public void Print()
    {
        System.out.println("非线程安全的单例模式.");
    }
}
