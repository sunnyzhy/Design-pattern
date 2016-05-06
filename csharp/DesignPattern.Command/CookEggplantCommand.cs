
namespace DesignPattern.Command
{
    /// <summary>
    /// 红烧茄子
    /// </summary>
    public class CookEggplantCommand : Command
    {
        private Chef chef;

        public CookEggplantCommand(Chef chef)
        {
            this.chef = chef;
            base.Name = "红烧茄子";
        }

        public override void Cook()
        {
            this.chef.CookEggplant();
        }
    }
}
