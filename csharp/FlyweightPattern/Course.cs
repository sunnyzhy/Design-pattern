
using System;
namespace FlyweightPattern
{
    public class Course : AbstractCourse
    {
        /// <summary>
        /// 课程名称
        /// </summary>
        private string name;

        /// <summary>
        /// 课时
        /// </summary>
        private int periods;

        public Course(string name, int periods)
        {
            this.name = name;
            this.periods = periods;
        }

        public override void Print(Student student)
        {
            Console.WriteLine(student.Name + ":\t" + this.name + "(" + this.periods + "课时)");
        }
    }
}
