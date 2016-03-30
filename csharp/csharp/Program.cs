
//using PrototypePattern;
//using SingletonPattern;
//using BuilderPattern;
//using AbstractFactoryPattern;
//using AbstractFactoryPattern.Factory;
//using FactoryMethodPattern;
//using FactoryMethodPattern.Factory;
//using SimpleFactoryPattern;
using System;
using System.Configuration;
using System.Reflection;
namespace csharp
{
    class Program
    {
        static void Main(string[] args)
        {
            #region 简单工厂(SimpleFactoryPattern)
            //string value = ConfigurationManager.AppSettings["simpleFactoryPattern"];
            //CarFactory factory = new CarFactory();
            //factory.name = value;
            //ICar car = factory.CreateCar();
            //car.Print();
            #endregion

            #region 工厂方法(FactoryMethodPattern)
            //string value = ConfigurationManager.AppSettings["factoryMethodPattern"];
            //ICarFactory factory = (ICarFactory)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //ICar car = factory.CreateCar();
            //car.Print();
            #endregion

            #region 抽象工厂(AbstractFactoryPattern)
            //string value = ConfigurationManager.AppSettings["abstractFactoryPattern"];
            //ICarFactory factory = (ICarFactory)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //IBody body = factory.CreateBody();
            //body.Install();
            //IEngine engine = factory.CreateEngine();
            //engine.Install();
            //IWheel wheel = factory.CreateWheel();
            //wheel.InstallLeftFrontWheel();
            //wheel.InstallRightFrontWheel();
            //wheel.InstallLeftBackWheel();
            //wheel.InstallRightBackWheel();
            #endregion

            #region 建造者模式（Builder）
            //Director director = new Director();
            //string value = ConfigurationManager.AppSettings["builderPattern"];
            //IBuilder builder = (IBuilder)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //director.Constrcut(builder);
            //Car car = builder.CreateCar();
            #endregion

            #region 原型模式（Prototype）
            //string value = ConfigurationManager.AppSettings["prototypePattern"];
            //AbstractStudent student = (AbstractStudent)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //student.Name = "Jim";
            //student.Age = 20;
            //student.Course = new Course() { Name = "C++" };
            //Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);

            //Console.WriteLine();
            //AbstractStudent student1 = (AbstractStudent)student.Clone();
            //student1.Name = "Tom";
            //student1.Age = 21;
            //student1.Course.Name = "C#";
            //Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);
            //Console.WriteLine("student1: " + student1.Name + "\t" + student1.Age + "\t" + student1.Course.Name);

            //Console.WriteLine();
            //student1.Course.Name = "Java";
            //Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);
            //Console.WriteLine("student1: " + student1.Name + "\t" + student1.Age + "\t" + student1.Course.Name);
            #endregion

            #region 单例模式（Singleton）
            //Singleton instance = Singleton.GetInstance();
            //instance.Print();
            #endregion

            Console.Read();
        }
    }

   
}
