package com.zhy.DesignPattern.SimpleFactory;

public class CarFactory {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public ICar CreateCar()
    {
        ICar car = null;
        switch (name.toLowerCase())
        { 
            case "audi":
                car = new Audi();
                break;
            case "benz":
                car = new Benz();
                break;
        }
        return car;
    }
}
