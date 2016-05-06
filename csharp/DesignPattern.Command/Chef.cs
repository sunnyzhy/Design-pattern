
using System;
namespace DesignPattern.Command
{
    /// <summary>
    /// 厨师
    /// </summary>
    public class Chef
    {
        public void CookBeef()
        {
            Console.WriteLine("大厨开始爆炒牛肉.");
            Console.WriteLine("爆炒牛肉出锅.");
        }

        public void CookFish()
        {
            Console.WriteLine("大厨开始水煮鱼.");
            Console.WriteLine("水煮鱼出锅.");
        }

        public void CookEggplant()
        {
            Console.WriteLine("大厨开始红烧茄子.");
            Console.WriteLine("红烧茄子出锅.");
        }
    }
}
