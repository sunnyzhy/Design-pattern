
using System;
namespace DesignPattern.AbstractFactory.ProductBody
{
    /// <summary>
    /// 奥迪的车体结构
    /// </summary>
    public class AudiBody : IBody
    {
        public void Install()
        {
            Console.WriteLine("安装奥迪的车身结构.");
        }
    }
}
