
namespace DesignPattern.Prototype.Deep
{
    /// <summary>
    /// 深拷贝
    /// </summary>
    public class Student : AbstractStudent
    {
        public override AbstractStudent Clone()
        {
            Student student = new Student();
            student.Name = base.Name;
            student.Age = base.Age;
            student.Course = new Course();
            student.Course.Name = base.Course.Name;

            return student;
        }   
    }
}
