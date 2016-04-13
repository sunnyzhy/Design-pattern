
using System;
namespace DecoratorPattern
{
    /// <summary>
    /// 鸡蛋
    /// </summary>
    public class Egg : Ingredients
    {
        public Egg(Food food)
            : base(food)
        {
            this.Name = "鸡蛋" + this.food.Name;
        }

        public override void Cook()
        {
            Console.WriteLine(this.Name);
        }
    }
}
