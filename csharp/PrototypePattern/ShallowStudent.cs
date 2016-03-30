
using System;
namespace PrototypePattern
{
    /// <summary>
    /// 浅拷贝
    /// </summary>
    public class ShallowStudent : AbstractStudent
    {
        public override AbstractStudent Clone()
        {
            ShallowStudent student = new ShallowStudent();
            student.Name = base.Name;
            student.Age = base.Age;
            student.Course = base.Course;

            return student;
        }
    }
}
