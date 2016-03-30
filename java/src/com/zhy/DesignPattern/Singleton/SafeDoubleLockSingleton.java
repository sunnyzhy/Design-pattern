package com.zhy.DesignPattern.Singleton;

public final class SafeDoubleLockSingleton {

	private static SafeDoubleLockSingleton instance;

    private SafeDoubleLockSingleton()
    {

    }

    public static SafeDoubleLockSingleton GetInstance()
    {
        if (instance == null)
        {
        	synchronized (SafeDoubleLockSingleton.class)
            {
                if (instance == null)
                {
                    instance = new SafeDoubleLockSingleton();
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
