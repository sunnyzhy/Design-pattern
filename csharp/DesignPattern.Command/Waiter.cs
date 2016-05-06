
using System;
using System.Collections.Generic;
namespace DesignPattern.Command
{
    /// <summary>
    /// 服务员
    /// </summary>
    public class Waiter
    {
        private List<Command> commands;

        public Waiter()
        {
            this.commands = new List<Command>();
        }

        public void SetOrder(Command command)
        {
            this.commands.Add(command);
            Console.WriteLine("增加订单：" + command.Name);
        }

        public void CancelOrder(Command command)
        {
            this.commands.Remove(command);
            Console.WriteLine("取消订单：" + command.Name);
        }

        public void Notify()
        {
            foreach (Command command in this.commands)
            {
                command.Cook();
            }
        }
    }
}
