
using System;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;
namespace PrototypePattern.DeepSerialize
{
    [Serializable]
    /// <summary>
    /// 深拷贝
    /// </summary>
    public class Student : AbstractStudent
    {
        public override AbstractStudent Clone()
        {
            using (Stream objectStream = new MemoryStream())
            {
                IFormatter formatter = new BinaryFormatter();
                formatter.Serialize(objectStream, this);
                objectStream.Seek(0, SeekOrigin.Begin);
                return formatter.Deserialize(objectStream) as Student;
            }
        }
    }
}
