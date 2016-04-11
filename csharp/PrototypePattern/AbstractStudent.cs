
using System;
namespace PrototypePattern
{
    [Serializable]
    public abstract class AbstractStudent
    {
        public string Name { get; set; }
        public int Age { get; set; }
        public Course Course { get; set; }

        public abstract AbstractStudent Clone();
    }
}
