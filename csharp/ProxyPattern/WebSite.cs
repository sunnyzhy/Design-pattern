
namespace ProxyPattern
{
    public abstract class WebSite
    {
        public abstract void Request(string url);
        public abstract string Response();
    }
}
