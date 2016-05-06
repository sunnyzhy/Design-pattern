
namespace DesignPattern.Builder
{
    /// <summary>
    /// 指挥者
    /// </summary>
    public class Director
    {
        public void Constrcut(IBuilder builder)
        {
            builder.BuildBody();
            builder.BuildEngine();
            builder.BuildWheel();
        }
    }
}
