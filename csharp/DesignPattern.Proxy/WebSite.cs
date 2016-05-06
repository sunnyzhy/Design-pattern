
namespace DesignPattern.Proxy
{
    public abstract class WebSite
    {
        public abstract void Request(string url);
        public abstract string Response();
    }
}
