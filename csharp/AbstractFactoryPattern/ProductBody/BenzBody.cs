using System;

namespace AbstractFactoryPattern.ProductBody
{
    /// <summary>
    /// 奔驰的车体结构
    /// </summary>
    public class BenzBody : IBody
    {
        public void Install()
        {
            Console.WriteLine("安装奔驰的车身结构.");
        }
    }
}
