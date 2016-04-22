
using ResponsibilityPattern;
//using ProxyPattern;
//using FlyweightPattern;
//using FacadePattern;
//using DecoratorPattern;
//using CompositePattern.Transparent;
//using BridgePattern;
//using AdapterPattern;
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

            #region 适配器模式（Adapter）
            //ICalculation calculation = new Calculation();
            //Console.WriteLine(calculation.Add(1.1, 2.2));

            //string value = ConfigurationManager.AppSettings["adapterPattern"];
            ////calculation = (ICalculation)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value, true, BindingFlags.Default, null, new object[1] { new CalculationAdaptee() }, null, null);
            //calculation = (ICalculation)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //Console.WriteLine(calculation.Add(1.1, 2.2));
            #endregion

            #region 桥接模式（Bridge）
            //string value = ConfigurationManager.AppSettings["bridgePatternApp"];
            //MobilePhoneApp app = (MobilePhoneApp)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value);
            //value = ConfigurationManager.AppSettings["bridgePatternPhone"];
            //MobilePhone phone = (MobilePhone)Assembly.Load(value.Substring(0, value.IndexOf('.'))).CreateInstance(value, true, BindingFlags.Default, null, new object[1] { app }, null, null);
            //phone.Run();
            #endregion

            #region 组合模式（Composite）
            //Composite root = new Composite("root", 0);
            //Composite node1 = new Composite("node1", 1);
            //node1.Add(new Leaf("leaf10", 2));
            //node1.Add(new Leaf("leaf11", 2));
            //root.Add(node1);

            //Composite node2 = new Composite("node2", 1);
            //node2.Add(new Leaf("leaf20", 2));
            //Composite node3 = new Composite("node21", 2);
            //node3.Add(new Leaf("leaf22", 3));
            //node2.Add(node3);
            //root.Add(node2);

            //Console.WriteLine(root.Name);
            //root.Display(root);

            //Console.WriteLine("==========");

            //root.Remove(node2);
            //Console.WriteLine(root.Name);
            //root.Display(root);
            #endregion

            #region 装饰模式（Decorator）
            //Food noodles = new Noodles();
            //Egg egg = new Egg(noodles);
            //Tomato tomato = new Tomato(egg);
            //tomato.Cook();
            #endregion 

            #region 外观模式（Facade）
            //Facade facade = new Facade();
            //facade.Cook();
            #endregion 

            #region 享元模式（Flyweight）
            //CourseFactory factory = new CourseFactory();
            //Student jim = new Student("Jim");
            //Student tom = new Student("Tom");
            //Course course1 = factory.GetCourse("Java", 20);
            //course1.Print(jim);
            //Course course2 = factory.GetCourse("C++", 30);
            //course2.Print(jim);
            //Course course3 = factory.GetCourse("C#", 10);
            //course3.Print(jim);
            //Course course4 = factory.GetCourse("Java", 20);
            //course4.Print(tom);
            //Course course5 = factory.GetCourse("C#", 10);
            //course5.Print(tom);
            //factory.GetCourseCount();
            #endregion 

            #region 代理模式（Proxy）
            //Google google = new Google();
            //Proxy proxy = new Proxy(google);
            //proxy.Request("www.google.com");
            //Console.WriteLine(proxy.Response());
            #endregion 

            #region 职责链模式（Chain of Responsibility）
            Manager manager = new Manager("Manager");
            Majordomo majordomo = new Majordomo("Majordomo");
            Boss boss = new Boss("Boss");

            manager.SetSuperior(majordomo);
            majordomo.SetSuperior(boss);

            Request request1 = new Request();
            request1.Name = "Jim";
            request1.Days = 1.5;
            manager.HandeRequest(request1);

            Request request2 = new Request();
            request2.Name = "Tom";
            request2.Days = 2;
            manager.HandeRequest(request2);

            Request request3 = new Request();
            request3.Name = "Sam";
            request3.Days = 5;
            manager.HandeRequest(request3);

            #endregion 
            Console.Read();
        }
    }


   
}
