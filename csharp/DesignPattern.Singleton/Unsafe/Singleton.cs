
using System;
namespace DesignPattern.Singleton.Unsafe
{
    /// <summary>
    /// 非线程安全的单例模式
    /// </summary>
    public sealed class Singleton
    {
        private static Singleton instance;

        /// <summary>
        /// 私有的构造函数
        /// </summary>
        private Singleton() 
        { 

        }

        public static Singleton GetInstance()
        {
            if (instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }

        public void Print()
        {
            Console.WriteLine("非线程安全的单例模式.");
        }
    }
}
