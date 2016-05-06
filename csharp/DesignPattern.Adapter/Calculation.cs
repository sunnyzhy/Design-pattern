
namespace DesignPattern.Adapter
{
    /// <summary>
    /// 具体的目标运算类
    /// </summary>
    public class Calculation : ICalculation
    {
        public double Add(double x, double y)
        {
            return x + y;
        }
    }
}
