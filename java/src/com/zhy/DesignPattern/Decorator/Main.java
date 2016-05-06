package com.zhy.DesignPattern.Decorator;

//×°ÊÎÄ£Ê½£¨Decorator£©
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food noodles = new Noodles();
      Egg egg = new Egg(noodles);
      Tomato tomato = new Tomato(egg);
      tomato.Cook();
	}

}
