package com.zhy.DesignPattern.Composite.Safe;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> children = new ArrayList<Component>();
	
	public Composite(String name,int depth) {

		super(name, depth);
	}

	public void Add(Component component) {
		// TODO Auto-generated method stub
		this.children.add(component);
	}

	public void Remove(Component component) {
		// TODO Auto-generated method stub
		this.children.remove(component);
	}
	
	public Component GetChild(int i) {
		// TODO Auto-generated method stub
		if (i >= 0 && i < this.children.size())
        {
            return this.children.get(i);
        }
        else
        {
            return null;
        }
	}
	
	@Override
	public void Display(Component component) {
		// TODO Auto-generated method stub
		   for (Component c : ((Composite)component).children)
           {
               if (c.getClass().equals(Leaf.class))
               {
                   c.Display(c);
                   continue;
               }
               for(int i=0;i<c.getDepth();i++)
               {
            	   System.out.print("-");
               }
               System.out.print(c.getName());
               System.out.println();
               Display((Composite)c);
           }
	}
}
