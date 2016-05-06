using System;

namespace DesignPattern.AbstractFactory.ProductWheel
{
    /// <summary>
    /// 奔驰车轮
    /// </summary>
    public class BenzWheel : IWheel
    {
        public void InstallLeftFrontWheel()
        {
            Console.WriteLine("安装奔驰的左前车轮.");
        }

        public void InstallRightFrontWheel()
        {
            Console.WriteLine("安装奔驰的右前车轮.");
        }

        public void InstallLeftBackWheel()
        {
            Console.WriteLine("安装奔驰的左后车轮.");
        }

        public void InstallRightBackWheel()
        {
            Console.WriteLine("安装奔驰的右后车轮.");
        }
    }
}
