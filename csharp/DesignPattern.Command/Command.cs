
namespace DesignPattern.Command
{
    public abstract class Command
    {
        public string Name { get; set; }
        public abstract void Cook();
    }
}
