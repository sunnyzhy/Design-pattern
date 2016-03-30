
using System;
using System.IO;
using System.Runtime.Serialization;
using System.Runtime.Serialization.Formatters.Binary;
namespace PrototypePattern
{
    [Serializable]
    /// <summary>
    /// 深拷贝
    /// </summary>
    public class DeepStudentSerialize : ICloneable
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public Course Course { get; set; }

        public object Clone()
        {
            using (Stream objectStream = new MemoryStream())
            {
                IFormatter formatter = new BinaryFormatter();
                formatter.Serialize(objectStream, this);
                objectStream.Seek(0, SeekOrigin.Begin);
                return formatter.Deserialize(objectStream);
            }
        }
    }
}
