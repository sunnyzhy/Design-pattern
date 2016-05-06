
using DesignPattern.AbstractFactory.ProductBody;
using DesignPattern.AbstractFactory.ProductEngine;
using DesignPattern.AbstractFactory.ProductWheel;
namespace DesignPattern.AbstractFactory.Factory
{
    /// <summary>
    /// 具体的奥迪工厂类
    /// </summary>
    public class AudiFactory : ICarFactory
    {
        public IEngine CreateEngine()
        {
            return new AudiEngine();
        }

        public IWheel CreateWheel()
        {
            return new AudiWheel();
        }

        public IBody CreateBody()
        {
            return new AudiBody();
        }

    }
}
