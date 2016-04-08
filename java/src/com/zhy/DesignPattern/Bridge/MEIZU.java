package com.zhy.DesignPattern.Bridge;

public class MEIZU extends MobilePhone {

	public MEIZU(MobilePhoneApp app)
	{
		super(app);
	}
	
	@Override
	public void Run() {

		this.app.Run();
	}
}
