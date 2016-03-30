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
        System.out.println("��̬��ʼ�����̰߳�ȫ�ĵ���ģʽ.");
    }
}
