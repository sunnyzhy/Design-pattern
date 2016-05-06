
using System;
using System.Collections.Generic;
namespace DesignPattern.Composite.Transparent
{
    /// <summary>
    /// 树枝类
    /// </summary>
    public class Composite : Component
    {
        /// <summary>
        /// 子节点集合
        /// </summary>
        private List<Component> children = new List<Component>();

        public Composite(string name, int depth)
            : base(name, depth)
        {

        }

        public override void Add(Component component)
        {
            this.children.Add(component);
        }

        public override void Remove(Component component)
        {
            this.children.Remove(component);
        }

        public override Component GetChild(int i)
        {
            if (i >= 0 && i < this.children.Count)
            {
                return this.children[i];
            }
            else
            {
                return null;
            }
        }

        public override void Display(Component component)
        {
            foreach (Component c in ((Composite)component).children)
            {
                if (c is Composite)
                {
                    Console.WriteLine(c.Name.PadLeft(c.Depth + c.Name.Length, '-'));
                    Display(c);
                }
                else
                {
                    c.Display(c);
                }
            }
        }
    }
}
