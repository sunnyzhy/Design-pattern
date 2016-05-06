
namespace DesignPattern.Decorator
{
    /// <summary>
    /// 食物
    /// </summary>
    public abstract class Food
    {
        private string name;
        /// <summary>
        /// 食物的名称
        /// </summary>
        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        public abstract void Cook();
    }
}
