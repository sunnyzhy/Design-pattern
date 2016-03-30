
using System;
namespace AbstractFactoryPattern.ProductEngine
{
    /// <summary>
    /// 奥迪发动机
    /// </summary>
    public class AudiEngine : IEngine
    {
        public void Install()
        {
            Console.WriteLine("安装奥迪的发动机.");
        }
    }
}
