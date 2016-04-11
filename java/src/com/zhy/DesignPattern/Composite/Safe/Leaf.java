package com.zhy.DesignPattern.Composite.Safe;

public class Leaf extends Component {

	public Leaf(String name,int depth) {
		// TODO Auto-generated constructor stub
		super(name, depth);
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
