
using System;
namespace DesignPattern.Decorator
{
    /// <summary>
    /// 西红柿
    /// </summary>
    public class Tomato : Ingredients
    {
        public Tomato(Food food)
            : base(food)
        {
            this.Name = "西红柿" + this.food.Name;
        }

        public override void Cook()
        {
            Console.WriteLine(this.Name);
        }
    }

}
