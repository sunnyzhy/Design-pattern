
namespace BuilderPattern
{
    public interface IBuilder
    {
        void BuildBody();
        void BuildEngine();
        void BuildWheel();
        Car CreateCar();
    }
}
