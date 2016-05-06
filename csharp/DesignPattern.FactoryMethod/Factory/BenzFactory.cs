
using DesignPattern.FactoryMethod.Product;
namespace DesignPattern.FactoryMethod.Factory
{
    /// <summary>
    /// 具体的奔驰工厂类
    /// </summary>
    public class BenzFactory : ICarFactory
    {
        /// <summary>
        /// 生产汽车
        /// </summary>
        /// <returns></returns>
        public ICar CreateCar()
        {
            return new Benz();
        }
    }
}
