package com.zhy.DesignPattern.Singleton.DoubleLock;

//����ģʽ��Singleton��
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton instance = Singleton.GetInstance();
		instance.Print();
	}

}
