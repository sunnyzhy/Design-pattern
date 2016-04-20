package com.zhy.DesignPattern.Proxy;

public class Proxy extends WebSite {

	private Google google;
	
	public Proxy(Google google)
    {
        this.google = google;
    }
	 
	@Override
	public void Request(String url) {
		// TODO Auto-generated method stub
		this.google.Request(url);
	}
	
	@Override
	public String Response() {
		// TODO Auto-generated method stub
		return this.google.Response();
	}
}
