package com.zhy.DesignPattern.AbstractFactory;

public class AudiWheel implements IWheel {

	@Override
	public void InstallLeftFrontWheel() {
		System.out.println("安装奥迪的左前车轮.");
	}
	
	@Override
	public void InstallRightFrontWheel() {
		System.out.println("安装奥迪的右前车轮.");
	}
	
	@Override
	public void InstallLeftBackWheel() {
		System.out.println("安装奥迪的左后车轮.");
	}
	
	@Override
	public void InstallRightBackWheel() {
		System.out.println("安装奥迪的右后车轮.");
	}
}
