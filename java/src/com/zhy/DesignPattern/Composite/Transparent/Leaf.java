package com.zhy.DesignPattern.Composite.Transparent;

public class Leaf extends Component{

	public Leaf(String name,int depth) {
		// TODO Auto-generated constructor stub
		super(name, depth);
	}
	
	@Override
	public void Add(Component component) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void Remove(Component component) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Component GetChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void Display(Component component) {
		// TODO Auto-generated method stub
		for(int i=0;i<component.getDepth();i++)
        {
     	   System.out.print("-");
        }
        System.out.print(component.getName());
        System.out.println();
	}
}
