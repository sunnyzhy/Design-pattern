package com.zhy.DesignPattern.Composite.Safe;

//组合模式（Composite）,安全的组合模式
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root = new Composite("root", 0);
      Composite node1 = new Composite("node1", 1);
      node1.Add(new Leaf("leaf10", 2));
      node1.Add(new Leaf("leaf11", 2));
      root.Add(node1);

      Composite node2 = new Composite("node2", 1);
      node2.Add(new Leaf("leaf20", 2));
      Composite node3 = new Composite("node21", 2);
      node3.Add(new Leaf("leaf22", 3));
      node2.Add(node3);
      root.Add(node2);

      System.out.println(root.getName());
      root.Display(root);
      
      System.out.println("==========");
      
      root.Remove(node2);
      System.out.println(root.getName());
      root.Display(root);
	}

}
