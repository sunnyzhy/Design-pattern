
using System;
namespace DecoratorPattern
{
    /// <summary>
    /// 面条
    /// </summary>
    public class Noodles : Food
    {
        public Noodles()
        {
            this.Name = "面条";
        }

        public override void Cook()
        {
            Console.WriteLine(this.Name);
        }
    }
}
