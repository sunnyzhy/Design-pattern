
namespace DesignPattern.Builder
{
    /// <summary>
    /// 建造者接口
    /// </summary>
    public interface IBuilder
    {
        void BuildBody();
        void BuildEngine();
        void BuildWheel();
        Car CreateCar();
    }
}
