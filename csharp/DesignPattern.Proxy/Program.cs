
using System;
namespace DesignPattern.Proxy
{
    /// <summary>
    /// 代理模式（Proxy）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Google google = new Google();
            Proxy proxy = new Proxy(google);
            proxy.Request("www.google.com");
            Console.WriteLine(proxy.Response());

            Console.Read();
        }
    }
}
