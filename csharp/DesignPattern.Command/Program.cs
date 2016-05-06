
using System;
namespace DesignPattern.Command
{
    /// <summary>
    /// 命令模式（Command）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            Chef chef = new Chef();
            Command cookBeef = new CookBeefCommand(chef);
            Command cookEggplant = new CookEggplantCommand(chef);
            Command cookFish = new CookFishCommand(chef);

            Waiter waiter = new Waiter();
            waiter.SetOrder(cookBeef);
            waiter.SetOrder(cookEggplant);
            waiter.SetOrder(cookFish);
            waiter.CancelOrder(cookFish);
            waiter.Notify();

            Console.Read();
        }
    }
}
