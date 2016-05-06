
using System;
using System.Collections.Generic;
namespace DesignPattern.Flyweight
{
    public class CourseFactory
    {
        private Dictionary<string,Course> courses = new Dictionary<string,Course>();

        /// <summary>
        /// 获取课程
        /// </summary>
        /// <param name="name"></param>
        /// <param name="periods"></param>
        /// <returns></returns>
        public Course GetCourse(string name, int periods)
        {
            if (!this.courses.ContainsKey(name)) //不存在相应的课程就新建一个课程实例
            {
                courses.Add(name, new Course(name, periods));
            }
            return this.courses[name];
        }

        /// <summary>
        /// 获取开课总数
        /// </summary>
        /// <returns></returns>
        public int GetCourseCount()
        {
            Console.WriteLine("开课总数：" + this.courses.Count);
            return this.courses.Count;
        }
    }
}
