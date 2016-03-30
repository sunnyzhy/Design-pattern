
namespace PrototypePattern
{
    /// <summary>
    /// 深拷贝
    /// </summary>
    public class DeepStudent : AbstractStudent
    {
        public override AbstractStudent Clone()
        {
            DeepStudent student = new DeepStudent();
            student.Name = base.Name;
            student.Age = base.Age;
            student.Course = new Course();
            student.Course.Name = base.Course.Name;

            return student;
        }   
    }
}
