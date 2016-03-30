package com.zhy.DesignPattern.AbstractFactory;

public class AudiBody implements IBody {
	
	@Override
	public void Install() {
		System.out.println("安装奥迪的车身结构.");
	}
}
