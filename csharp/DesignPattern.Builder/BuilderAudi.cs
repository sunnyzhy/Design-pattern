
using System;
namespace DesignPattern.Builder
{
    /// <summary>
    /// 奥迪建造者
    /// </summary>
    public class BuilderAudi : IBuilder
    {
        private Car car = new Car();

        public void BuildBody()
        {
            car.body = new Body() { Description = "奥迪的车身结构." };
            Console.WriteLine(string.Format("安装{0}", car.body.Description));
        }

        public void BuildEngine()
        {
            car.engine = new Engine() { Description = "奥迪的发动机." };
            Console.WriteLine(string.Format("安装{0}", car.engine.Description));
        }

        public void BuildWheel()
        {
            car.wheel = new Wheel() { Description = "奥迪的车轮." };
            Console.WriteLine(string.Format("安装{0}", car.wheel.Description));
        }

        public Car CreateCar()
        {
            Console.WriteLine("奥迪车安装完成.");
            return car;
        }
    }
}
