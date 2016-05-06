package com.zhy.DesignPattern.Responsibility;

//职责链模式（Chain of Responsibility）
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Manager manager = new Manager("Manager");
      Majordomo majordomo = new Majordomo("Majordomo");
      Boss boss = new Boss("Boss");

      manager.SetSuperior(majordomo);
      majordomo.SetSuperior(boss);

      Request request1 = new Request();
      request1.setName("Jim");
      request1.setDays(1.5);
      manager.HandeRequest(request1);

      Request request2 = new Request();
      request2.setName("Tom");
      request2.setDays(2);
      manager.HandeRequest(request2);

      Request request3 = new Request();
      request3.setName("Sam");
      request3.setDays(5);
      manager.HandeRequest(request3);
	}

}
