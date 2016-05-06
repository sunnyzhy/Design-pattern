
using System;
namespace DesignPattern.Responsibility
{
    /// <summary>
    /// 总监
    /// </summary>
    public class Majordomo:Handler
    {
        public Majordomo(string name)
            : base(name)
        { 

        }

        public override void HandeRequest(Request request)
        {
            if (request.Days > 0 && request.Days < 3)
            {
                Console.WriteLine(this.Name + "批准了" + request.Name + "的" + request.Days + "天假期.");
            }
            else
            {
                if (this.superior != null)
                {
                    this.superior.HandeRequest(request);
                }
            }
        }
    }
}
