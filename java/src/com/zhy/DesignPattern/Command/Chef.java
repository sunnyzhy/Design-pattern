package com.zhy.DesignPattern.Command;

public class Chef {

	public void CookBeef()
    {
        System.out.println("大厨开始爆炒牛肉.");
        System.out.println("爆炒牛肉出锅.");
    }

    public void CookFish()
    {
    	System.out.println("大厨开始水煮鱼.");
    	System.out.println("水煮鱼出锅.");
    }

    public void CookEggplant()
    {
    	System.out.println("大厨开始红烧茄子.");
    	System.out.println("红烧茄子出锅.");
    }
}
