
using DesignPattern.AbstractFactory.ProductBody;
using DesignPattern.AbstractFactory.ProductEngine;
using DesignPattern.AbstractFactory.ProductWheel;
namespace DesignPattern.AbstractFactory.Factory
{
    /// <summary>
    /// 具体的奔驰工厂类
    /// </summary>
    public class BenzFactory : ICarFactory
    {
        public IEngine CreateEngine()
        {
            return new BenzEngine();
        }

        public IWheel CreateWheel()
        {
            return new BenzWheel();
        }

        public IBody CreateBody()
        {
            return new BenzBody();
        }
    }
}
