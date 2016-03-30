
using System;
namespace SingletonPattern
{
    /// <summary>
    /// 双重锁定，线程安全的单例模式
    /// </summary>
    public sealed class SafeDoubleLockSingleton
    {
        private static SafeDoubleLockSingleton instance;
        private static readonly object syncFlag = new object();

        /// <summary>
        /// 私有的构造函数
        /// </summary>
        private SafeDoubleLockSingleton()
        {

        }

        public static SafeDoubleLockSingleton GetInstance()
        {
            if (instance == null)
            {
                lock (syncFlag)
                {
                    if (instance == null)
                    {
                        instance = new SafeDoubleLockSingleton();
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
