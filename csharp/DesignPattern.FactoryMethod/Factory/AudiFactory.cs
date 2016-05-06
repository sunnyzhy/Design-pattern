
using DesignPattern.FactoryMethod.Product;
namespace DesignPattern.FactoryMethod.Factory
{
    /// <summary>
    /// 具体的奥迪工厂类
    /// </summary>
    public class AudiFactory : ICarFactory
    {
        /// <summary>
        /// 生产汽车
        /// </summary>
        /// <returns></returns>
        public ICar CreateCar()
        {
            return new Audi();
        }
    }
}
