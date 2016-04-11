
using System;
using System.Collections.Generic;
namespace CompositePattern.Safe
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

        /// <summary>
        /// 添加子节点
        /// </summary>
        /// <param name="component"></param>
        public void Add(Component component)
        {
            this.children.Add(component);
        }

        /// <summary>
        /// 移除子节点
        /// </summary>
        /// <param name="component"></param>
        public void Remove(Component component)
        {
            this.children.Remove(component);
        }

        /// <summary>
        /// 获取子节点
        /// </summary>
        /// <param name="i"></param>
        /// <returns></returns>
        public Component GetChild(int i)
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
                if (c is Leaf)
                {
                    c.Display(c);
                    continue;
                }
                Console.WriteLine(c.Name.PadLeft(c.Depth + c.Name.Length, '-'));
                Display((Composite)c);
            }
        }
    }
}
