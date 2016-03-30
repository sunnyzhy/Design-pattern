package com.zhy.DesignPattern.AbstractFactory;

public class BenzWheel implements IWheel {

	@Override
	public void InstallLeftFrontWheel() {
		System.out.println("安装奔驰的左前车轮.");
	}
	
	@Override
	public void InstallRightFrontWheel() {
		System.out.println("安装奔驰的右前车轮.");
	}
	
	@Override
	public void InstallLeftBackWheel() {
		System.out.println("安装奔驰的左后车轮.");
	}
	
	@Override
	public void InstallRightBackWheel() {
		System.out.println("安装奔驰的右后车轮.");
	}
}
