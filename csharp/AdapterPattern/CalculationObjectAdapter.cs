
namespace AdapterPattern
{
    public class CalculationObjectAdapter : ICalculation
    {
        private CalculationAdaptee calculation;

        public CalculationObjectAdapter(CalculationAdaptee calculation)
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
