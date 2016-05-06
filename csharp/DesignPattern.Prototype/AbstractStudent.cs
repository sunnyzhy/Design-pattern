
using System;
namespace DesignPattern.Prototype
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
