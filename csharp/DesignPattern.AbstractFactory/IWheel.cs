
namespace DesignPattern.AbstractFactory
{
    /// <summary>
    /// 车轮接口
    /// </summary>
    public interface IWheel
    {
        void InstallLeftFrontWheel();
        void InstallRightFrontWheel();
        void InstallLeftBackWheel();
        void InstallRightBackWheel();
    }
}
