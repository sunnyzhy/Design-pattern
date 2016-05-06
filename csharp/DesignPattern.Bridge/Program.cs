
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.Bridge
{
    /// <summary>
    /// 桥接模式（Bridge）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string value = ConfigurationManager.AppSettings["bridgePatternApp"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            MobilePhoneApp app = (MobilePhoneApp)Assembly.Load(assembly).CreateInstance(value);
            app.Run();

            value = ConfigurationManager.AppSettings["bridgePatternPhone"];
            assembly = value.Substring(0, value.LastIndexOf('.'));
            MobilePhone phone = (MobilePhone)Assembly.Load(assembly).CreateInstance(value, true, BindingFlags.Default, null, new object[1] { app }, null, null);
            phone.Run();

            Console.Read();
        }
    }
}
