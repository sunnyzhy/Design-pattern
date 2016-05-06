package com.zhy.DesignPattern.Command;

public class CookFishCommand extends AbstractCommand {

	private Chef chef;
	public CookFishCommand(Chef chef) {
		// TODO Auto-generated constructor stub
		this.chef = chef;
		super.setName("ЫЎжѓгу");
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		this.chef.CookFish();
	}
}
