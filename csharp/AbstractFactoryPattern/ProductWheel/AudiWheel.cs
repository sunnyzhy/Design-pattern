
using System;
namespace AbstractFactoryPattern.ProductWheel
{
    /// <summary>
    /// 奥迪车轮
    /// </summary>
    public class AudiWheel : IWheel
    {
        public void InstallLeftFrontWheel()
        {
            Console.WriteLine("安装奥迪的左前车轮.");
        }

        public void InstallRightFrontWheel()
        {
            Console.WriteLine("安装奥迪的右前车轮.");
        }

        public void InstallLeftBackWheel()
        {
            Console.WriteLine("安装奥迪的左后车轮.");
        }

        public void InstallRightBackWheel()
        {
            Console.WriteLine("安装奥迪的右后车轮.");
        }
    }
}
