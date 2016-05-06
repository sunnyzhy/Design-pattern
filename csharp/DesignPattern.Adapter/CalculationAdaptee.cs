
namespace DesignPattern.Adapter
{
    /// <summary>
    /// 需要适配的运算类
    /// </summary>
    public class CalculationAdaptee
    {
        public int AddMethod(int x, int y)
        {
            return x + y;
        }
    }
}
