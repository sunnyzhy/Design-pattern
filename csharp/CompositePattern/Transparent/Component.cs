
namespace CompositePattern.Transparent
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

        #region 管理成员对象的方法
        /// <summary>
        /// 添加子节点
        /// </summary>
        /// <param name="component"></param>
        public abstract void Add(Component component);

        /// <summary>
        /// 移除子节点
        /// </summary>
        /// <param name="component"></param>
        public abstract void Remove(Component component);

        /// <summary>
        /// 获取子节点
        /// </summary>
        /// <param name="i"></param>
        /// <returns></returns>
        public abstract Component GetChild(int i);
        #endregion

        /// <summary>
        /// 子节点操作
        /// </summary>
        public abstract void Display(Component component);
    }
}
