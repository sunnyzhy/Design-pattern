package com.zhy.DesignPattern.Proxy;

//代理模式（Proxy）
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Google google = new Google();
      Proxy proxy = new Proxy(google);
      proxy.Request("www.google.com");
      System.out.println(proxy.Response());
	}

}
