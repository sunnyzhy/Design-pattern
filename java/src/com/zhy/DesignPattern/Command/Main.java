package com.zhy.DesignPattern.Command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef chef = new Chef();
      AbstractCommand cookBeef = new CookBeefCommand(chef);
      AbstractCommand cookEggplant = new CookEggplantCommand(chef);
      AbstractCommand cookFish = new CookFishCommand(chef);

      Waiter waiter = new Waiter();
      waiter.SetOrder(cookBeef);
      waiter.SetOrder(cookEggplant);
      waiter.SetOrder(cookFish);
      waiter.CancelOrder(cookFish);
      waiter.Notify();
	}

}
