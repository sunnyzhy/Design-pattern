
using System;
namespace SingletonPattern
{
    /// <summary>
    /// 非线程安全的单例模式
    /// </summary>
    public sealed class UnsafeSingleton
    {
        private static UnsafeSingleton instance;

        /// <summary>
        /// 私有的构造函数
        /// </summary>
        private UnsafeSingleton() 
        { 

        }

        public static UnsafeSingleton GetInstance()
        {
            if (instance == null)
            {
                instance = new UnsafeSingleton();
            }
            return instance;
        }

        public void Print()
        {
            Console.WriteLine("非线程安全的单例模式.");
        }
    }
}
