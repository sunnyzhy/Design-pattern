
using SimpleFactoryPattern.Product;
namespace SimpleFactoryPattern
{
    /// <summary>
    /// 简单工厂
    /// 具体的汽车工厂类
    /// </summary>
    public class CarFactory
    {
        public string name { get; set; }

        /// <summary>
        /// 生产汽车
        /// </summary>
        /// <returns></returns>
        public ICar CreateCar()
        {
            ICar car = null;
            switch (name.ToLower())
            { 
                case "audi":
                    car = new Audi();
                    break;
                case "benz":
                    car = new Benz();
                    break;
            }
            return car;
        }
    }
}
