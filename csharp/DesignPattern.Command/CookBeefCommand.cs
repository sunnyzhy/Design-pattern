
namespace DesignPattern.Command
{
    /// <summary>
    /// 爆炒牛肉
    /// </summary>
    public class CookBeefCommand : Command
    {
        private Chef chef;

        public CookBeefCommand(Chef chef)
        {
            this.chef = chef;
            base.Name = "爆炒牛肉";
        }

        public override void Cook()
        {
            this.chef.CookBeef();
        }


    }
}
