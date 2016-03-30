package com.zhy.DesignPattern.AbstractFactory;

public class BenzWheel implements IWheel {

	@Override
	public void InstallLeftFrontWheel() {
		System.out.println("��װ���۵���ǰ����.");
	}
	
	@Override
	public void InstallRightFrontWheel() {
		System.out.println("��װ���۵���ǰ����.");
	}
	
	@Override
	public void InstallLeftBackWheel() {
		System.out.println("��װ���۵������.");
	}
	
	@Override
	public void InstallRightBackWheel() {
		System.out.println("��װ���۵��Һ���.");
	}
}
