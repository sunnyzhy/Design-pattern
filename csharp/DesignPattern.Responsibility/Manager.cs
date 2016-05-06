
using System;
namespace DesignPattern.Responsibility
{
    /// <summary>
    /// 经理
    /// </summary>
    public class Manager : Handler
    {
        public Manager(string name)
            : base(name)
        { 
        
        }

        public override void HandeRequest(Request request)
        {
            if (request.Days > 0 && request.Days < 2)
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
