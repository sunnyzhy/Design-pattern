package com.zhy.DesignPattern.Responsibility;

public abstract class Handler {

	private String name;
	public String getName() {
		return name;
	}

	protected Handler superior;
	
	public Handler(String name)
	{
		this.name = name;
	}
	
	 public void SetSuperior(Handler superior)
     {
         this.superior = superior;
     }
	
	public abstract void HandeRequest(Request request);
}
