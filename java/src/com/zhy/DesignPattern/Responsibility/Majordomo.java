package com.zhy.DesignPattern.Responsibility;

public class Majordomo extends Handler {
	
	public Majordomo(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	
	@Override
	public void HandeRequest(Request request) {
		// TODO Auto-generated method stub
		if (request.getDays() > 0 && request.getDays() < 3)
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
