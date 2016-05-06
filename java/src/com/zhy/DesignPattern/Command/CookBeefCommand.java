package com.zhy.DesignPattern.Command;

public class CookBeefCommand extends AbstractCommand {
	
	private Chef chef;
	public CookBeefCommand(Chef chef) {
		// TODO Auto-generated constructor stub
		this.chef = chef;
		super.setName("±¨≥¥≈£»‚");
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		this.chef.CookBeef();
	}
}
