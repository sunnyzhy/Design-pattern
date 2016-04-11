package com.zhy.DesignPattern.Composite.Safe;

public abstract class Component {

	private String name;
	public String getName() {
		return name;
	}
	public int getDepth() {
		return depth;
	}
	private int depth;
	
    public Component(String name, int depth)
    {
        this.name = name;
        this.depth = depth;
    }
    
    public abstract void Display(Component component);
}
