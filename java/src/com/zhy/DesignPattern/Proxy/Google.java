package com.zhy.DesignPattern.Proxy;

public class Google extends WebSite {

	@Override
	public void Request(String url) {
		// TODO Auto-generated method stub
		System.out.println("get " + url);
	}
	
	@Override
	public String Response() {
		// TODO Auto-generated method stub
		return "Google";
	}
}
