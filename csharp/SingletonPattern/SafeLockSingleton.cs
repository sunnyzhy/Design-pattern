
using System;
namespace SingletonPattern
{
    /// <summary>
    /// 线程安全的单例模式
    /// </summary>
    public sealed class SafeLockSingleton
    {
        private static SafeLockSingleton instance;
        private static readonly object syncFlag = new object();

        /// <summary>
        /// 私有的构造函数
        /// </summary>
        private SafeLockSingleton()
        {

        }

        public static SafeLockSingleton GetInstance()
        {
            lock (syncFlag)
            {
                if (instance == null)
                {
                    instance = new SafeLockSingleton();
                }
            }
            return instance;
        }

        public void Print()
        {
            Console.WriteLine("线程安全的单例模式.");
        }
    }
}
