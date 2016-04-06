
namespace AdapterPattern
{
    public class Calculation : ICalculation
    {
        public double Add(double x, double y)
        {
            return x + y;
        }
    }
}
