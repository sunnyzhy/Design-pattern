
using System;
namespace CompositePattern.Safe
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

        public override void Display(Component component)
        {
            Console.WriteLine(component.Name.PadLeft(component.Depth + component.Name.Length, '-'));
        }
    }
}
