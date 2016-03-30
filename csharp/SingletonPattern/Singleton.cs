
using System;
namespace SingletonPattern
{
    /// <summary>
    /// 静态初始化，线程安全的单例模式
    /// </summary>
    public sealed class Singleton
    {
        private static readonly Singleton instance = new Singleton();

        /// <summary>
        /// 私有的构造函数
        /// </summary>
        private Singleton() 
        { 

        }

        public static Singleton GetInstance()
        {
            return instance;
        }

        public void Print()
        {
            Console.WriteLine("静态初始化，线程安全的单例模式.");
        }
    }
}
