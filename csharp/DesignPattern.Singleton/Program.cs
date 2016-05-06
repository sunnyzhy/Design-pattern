
using System;
namespace DesignPattern.Singleton
{
    /// <summary>
    /// 单例模式（Singleton）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Singleton instance = Singleton.GetInstance();
            instance.Print();

            Console.Read();
        }
    }
}
