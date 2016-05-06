
using System;
using System.Configuration;
using System.Reflection;
namespace DesignPattern.Prototype
{
    /// <summary>
    /// 原型模式（Prototype）
    /// </summary>
    class Program
    {
        static void Main(string[] args)
        {
            string value = ConfigurationManager.AppSettings["prototypePattern"];
            string assembly = value.Substring(0, value.LastIndexOf('.'));
            assembly = assembly.Substring(0, assembly.LastIndexOf('.'));
            AbstractStudent student = (AbstractStudent)Assembly.Load(assembly).CreateInstance(value);
            student.Name = "Jim";
            student.Age = 20;
            student.Course = new Course() { Name = "C++" };
            Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);

            Console.WriteLine();
            AbstractStudent student1 = (AbstractStudent)student.Clone();
            student1.Name = "Tom";
            student1.Age = 21;
            student1.Course.Name = "C#";
            Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);
            Console.WriteLine("student1: " + student1.Name + "\t" + student1.Age + "\t" + student1.Course.Name);

            Console.WriteLine();
            student1.Course.Name = "Java";
            Console.WriteLine("student : " + student.Name + "\t" + student.Age + "\t" + student.Course.Name);
            Console.WriteLine("student1: " + student1.Name + "\t" + student1.Age + "\t" + student1.Course.Name);

            Console.Read();
        }
    }
}
