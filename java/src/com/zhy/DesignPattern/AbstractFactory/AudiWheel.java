package com.zhy.DesignPattern.AbstractFactory;

public class AudiWheel implements IWheel {

	@Override
	public void InstallLeftFrontWheel() {
		System.out.println("��װ�µϵ���ǰ����.");
	}
	
	@Override
	public void InstallRightFrontWheel() {
		System.out.println("��װ�µϵ���ǰ����.");
	}
	
	@Override
	public void InstallLeftBackWheel() {
		System.out.println("��װ�µϵ������.");
	}
	
	@Override
	public void InstallRightBackWheel() {
		System.out.println("��װ�µϵ��Һ���.");
	}
}
