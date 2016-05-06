
namespace DesignPattern.Adapter.Class
{
    /// <summary>
    /// 类适配器
    /// </summary>
    public class CalculationAdapter : CalculationAdaptee, ICalculation
    {
        public double Add(double x, double y)
        {
            int value = base.AddMethod((int)x, (int)y);
            return (double)value;
        }
    }
}
