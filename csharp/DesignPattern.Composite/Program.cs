
using System;
using System.Configuration;
using System.Reflection;
using Com = DesignPattern.Composite.Safe;
namespace DesignPattern.Composite
{
    /// <summary>
    /// 组合模式（Composite）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Com.Composite root = new Com.Composite("root", 0);
            Com.Composite node1 = new Com.Composite("node1", 1);
            node1.Add(new Com.Leaf("leaf10", 2));
            node1.Add(new Com.Leaf("leaf11", 2));
            root.Add(node1);

            Com.Composite node2 = new Com.Composite("node2", 1);
            node2.Add(new Com.Leaf("leaf20", 2));
            Com.Composite node3 = new Com.Composite("node21", 2);
            node3.Add(new Com.Leaf("leaf22", 3));
            node2.Add(node3);
            root.Add(node2);

            Console.WriteLine(root.Name);
            root.Display(root);

            Console.WriteLine("==========");

            root.Remove(node2);
            Console.WriteLine(root.Name);
            root.Display(root);

            Console.Read();
        }
    }
}
