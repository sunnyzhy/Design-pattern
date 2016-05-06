
using System;
namespace DesignPattern.Responsibility
{
    /// <summary>
    /// 职责链模式（Chain of Responsibility）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
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

            Console.Read();
        }
    }
}
