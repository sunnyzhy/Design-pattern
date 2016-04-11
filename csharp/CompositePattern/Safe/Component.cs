
namespace CompositePattern.Safe
{
    /// <summary>
    /// 叶子和树枝的声明接口
    /// </summary>
    public abstract class Component
    {
        private string name;
        /// <summary>
        /// 节点名称
        /// </summary>
        public string Name
        {
            get { return name; }
        }

        private int depth;
        /// <summary>
        /// 节点深度
        /// </summary>
        public int Depth
        {
            get { return depth; }
        }

        public Component(string name, int depth)
        {
            this.name = name;
            this.depth = depth;
        }

        /// <summary>
        /// 子节点操作
        /// </summary>
        public abstract void Display(Component component);
    }
}
