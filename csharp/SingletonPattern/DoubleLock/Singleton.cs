
using System;
namespace SingletonPattern.DoubleLock
{
    /// <summary>
    /// 双重锁定，线程安全的单例模式
    /// </summary>
    public sealed class Singleton
    {
        private static Singleton instance;
        private static readonly object syncFlag = new object();

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
                lock (syncFlag)
                {
                    if (instance == null)
                    {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }

        public void Print()
        {
            Console.WriteLine("双重锁定,线程安全的单例模式.");
        }
    }
}
