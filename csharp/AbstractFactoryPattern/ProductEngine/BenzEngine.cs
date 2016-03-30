using System;

namespace AbstractFactoryPattern.ProductEngine
{
    /// <summary>
    /// 奔驰发动机
    /// </summary>
    public class BenzEngine : IEngine
    {
        public void Install()
        {
            Console.WriteLine("安装奔驰的发动机.");
        }
    }
}
