package com.zhy.DesignPattern.Command;

public class CookEggplantCommand extends AbstractCommand {
	
	private Chef chef;
	public CookEggplantCommand(Chef chef) {
		// TODO Auto-generated constructor stub
		this.chef = chef;
		super.setName("ºìÉÕÇÑ×Ó");
	}
	
	@Override
	public void Cook() {
		// TODO Auto-generated method stub
		this.chef.CookEggplant();
	}
}
