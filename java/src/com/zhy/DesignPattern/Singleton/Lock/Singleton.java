package com.zhy.DesignPattern.Singleton.Lock;


public class Singleton {

	private static Singleton instance;

    private Singleton()
    {

    }

    public static synchronized Singleton GetInstance()
    {
    	if (instance == null)
    	{
    		instance = new Singleton();
    	}
        return instance;
    }

    public void Print()
    {
        System.out.println("�̰߳�ȫ�ĵ���ģʽ.");
    }
}