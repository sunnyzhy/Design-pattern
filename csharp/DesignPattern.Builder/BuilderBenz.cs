
using System;
namespace DesignPattern.Builder
{
    /// <summary>
    /// 奔驰建造者
    /// </summary>
    public class BuilderBenz : IBuilder
    {
        private Car car = new Car();

        public void BuildBody()
        {
            car.body = new Body() { Description = "奔驰的车身结构." };
            Console.WriteLine(string.Format("安装{0}", car.body.Description));
        }

        public void BuildEngine()
        {
            car.engine = new Engine() { Description = "奔驰的发动机." };
            Console.WriteLine(string.Format("安装{0}", car.engine.Description));
        }

        public void BuildWheel()
        {
            car.wheel = new Wheel() { Description = "奔驰的车轮." };
            Console.WriteLine(string.Format("安装{0}", car.wheel.Description));
        }

        public Car CreateCar()
        {
            Console.WriteLine("奔驰车安装完成.");
            return car;
        }
    }
}
