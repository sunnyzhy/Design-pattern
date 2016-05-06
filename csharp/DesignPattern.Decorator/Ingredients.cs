
namespace DesignPattern.Decorator
{
    /// <summary>
    /// 食材
    /// </summary>
    public abstract class Ingredients : Food
    {
        protected Food food;

        public Ingredients(Food food)
        {
            this.food = food;
        }
    }
}
