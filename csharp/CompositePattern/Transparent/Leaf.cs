
using System;
namespace CompositePattern.Transparent
{
    /// <summary>
    /// 树叶类
    /// </summary>
    public class Leaf : Component
    {
        public Leaf(string name, int depth)
            : base(name, depth)
        {

        }

        public override void Add(Component component)
        {
            throw new System.NotImplementedException();
        }

        public override void Remove(Component component)
        {
            throw new System.NotImplementedException();
        }

        public override Component GetChild(int i)
        {
            throw new System.NotImplementedException();
        }

        public override void Display(Component component)
        {
            Console.WriteLine(component.Name.PadLeft(component.Depth + component.Name.Length, '-'));
        }
    }
}
