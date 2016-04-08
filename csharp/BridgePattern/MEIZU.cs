
namespace BridgePattern
{
    public class MEIZU : MobilePhone
    {
        public MEIZU(MobilePhoneApp app)
            : base(app)
        { 
        
        }

        public override void Run()
        {
            this.app.Run();
        }
    }
}
