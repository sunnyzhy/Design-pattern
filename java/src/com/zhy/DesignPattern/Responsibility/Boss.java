package com.zhy.DesignPattern.Responsibility;

public class Boss extends Handler {

	public Boss(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void HandeRequest(Request request) {
		// TODO Auto-generated method stub
        System.out.println(this.getName() + "��׼��" + request.getName() + "��" + request.getDays() + "�����.");
	}
}
