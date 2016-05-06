
using System;
namespace DesignPattern.Responsibility
{
    public class Boss : Handler
    {
        public Boss(string name)
            : base(name)
        {

        }

        public override void HandeRequest(Request request)
        {
            Console.WriteLine(this.Name + "批准了" + request.Name + "的" + request.Days + "天假期.");
        }
    }
}
