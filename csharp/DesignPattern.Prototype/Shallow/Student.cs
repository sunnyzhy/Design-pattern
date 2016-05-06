
using System;
namespace DesignPattern.Prototype.Shallow
{
    /// <summary>
    /// 浅拷贝
    /// </summary>
    public class Student : AbstractStudent
    {
        public override AbstractStudent Clone()
        {
            Student student = new Student();
            student.Name = base.Name;
            student.Age = base.Age;
            student.Course = base.Course;

            return student;
        }
    }
}
