
namespace AdapterPattern
{
    public class CalculationClassAdapter : CalculationAdaptee, ICalculation
    {
        public double Add(double x, double y)
        {
            int value = base.AddMethod((int)x, (int)y);
            return (double)value;
        }
    }
}
