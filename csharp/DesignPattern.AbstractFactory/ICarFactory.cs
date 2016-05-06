
namespace DesignPattern.AbstractFactory
{
    /// <summary>
    /// 汽车工厂接口
    /// </summary>
    public interface ICarFactory
    {
        IBody CreateBody();
        IEngine CreateEngine();
        IWheel CreateWheel();
    }
}
