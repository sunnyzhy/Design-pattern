package com.zhy.DesignPattern.Responsibility;

public class Manager extends Handler {

	public Manager(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void HandeRequest(Request request) {
		// TODO Auto-generated method stub
		if (request.getDays() > 0 && request.getDays() < 2)
        {
            System.out.println(this.getName() + "��׼��" + request.getName() + "��" + request.getDays() + "�����.");
        }
        else
        {
            if (this.superior != null)
            {
                this.superior.HandeRequest(request);
            }
        }
	}
}
