// CompositePattern.cpp : 定义控制台应用程序的入口点。
//

#include "stdafx.h"
#include "TransparentComposite.h"
#include "TransparentLeaf.h"

int _tmain(int argc, _TCHAR* argv[])
{
	TransparentComposite *root = new TransparentComposite("root",0,Composite);
	TransparentComposite *node1 = new TransparentComposite("node1",1,Composite);
	TransparentLeaf *leaf10 = new TransparentLeaf("leaf10",2,Leaf);
	TransparentLeaf *leaf11 = new TransparentLeaf("leaf11",2,Leaf);
	node1->Add(leaf10);
	node1->Add(leaf11);
	root->Add(node1);

	TransparentComposite *node2 = new TransparentComposite("node2",1,Composite);
	TransparentLeaf *leaf20 = new TransparentLeaf("leaf20",2,Leaf);
	node2->Add(leaf20);
	TransparentComposite *node3 = new TransparentComposite("node21",2,Composite);
	TransparentLeaf *leaf22 = new TransparentLeaf("leaf22",3,Leaf);
	node3->Add(leaf22);
	node2->Add(node3);
	root->Add(node2);
	
	cout<<root->name<<endl;
	root->Display(root);

	cout<<"=========="<<endl;

	root->Remove(node2);
	cout<<root->name<<endl;
	root->Display(root);

	delete leaf22;
	delete node3;
	delete leaf20;
	delete node2;
	delete leaf11;
	delete leaf10;
	delete node1;
	delete root;
	
	system("pause");
	return 0;
}

