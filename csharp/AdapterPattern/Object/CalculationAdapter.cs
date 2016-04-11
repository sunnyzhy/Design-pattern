
namespace AdapterPattern.Object
{
    /// <summary>
    /// 对象适配器
    /// </summary>
    public class CalculationAdapter : ICalculation
    {
        private CalculationAdaptee calculation;

        public CalculationAdapter(CalculationAdaptee calculation)
        {
            this.calculation = calculation;
        }

        public double Add(double x, double y)
        {
            int value = this.calculation.AddMethod((int)x, (int)y);
            return (double)value;
        }
    }
}
