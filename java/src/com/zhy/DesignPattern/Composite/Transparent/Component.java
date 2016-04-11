package com.zhy.DesignPattern.Composite.Transparent;

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
    
    public abstract void Add(Component component);

    public abstract void Remove(Component component);

    public abstract Component GetChild(int i);

    public abstract void Display(Component component);
}
