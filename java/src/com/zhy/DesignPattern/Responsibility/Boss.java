package com.zhy.DesignPattern.Responsibility;

public class Boss extends Handler {

	public Boss(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void HandeRequest(Request request) {
		// TODO Auto-generated method stub
        System.out.println(this.getName() + "批准了" + request.getName() + "的" + request.getDays() + "天假期.");
	}
}
