
namespace ProxyPattern
{
    public class Proxy : WebSite
    {
        private Google google;

        public Proxy(Google google)
        {
            this.google = google;
        }

        public override void Request(string url)
        {
            this.google.Request(url);
        }

        public override string Response()
        {
            return this.google.Response();
        }
    }
}
