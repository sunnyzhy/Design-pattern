
namespace DesignPattern.Command
{
    /// <summary>
    /// 水煮鱼
    /// </summary>
    public class CookFishCommand : Command
    {
        private Chef chef;

        public CookFishCommand(Chef chef)
        {
            this.chef = chef;
            base.Name = "水煮鱼";
        }

        public override void Cook()
        {
            this.chef.CookFish();
        }
    }
}
