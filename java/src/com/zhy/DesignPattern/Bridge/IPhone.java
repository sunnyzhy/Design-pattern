package com.zhy.DesignPattern.Bridge;

public class IPhone extends MobilePhone {

	public IPhone(MobilePhoneApp app) {
		
		super(app);
	}
	
	@Override
	public void Run() {
		
		this.app.Run();
	}
}
