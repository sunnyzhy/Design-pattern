
using System;
namespace ProxyPattern
{
    public class Google : WebSite
    {
        public override void Request(string url)
        {
            Console.WriteLine("get " + url);
        }

        public override string Response()
        {
            return "Google";
        }
    }
}
