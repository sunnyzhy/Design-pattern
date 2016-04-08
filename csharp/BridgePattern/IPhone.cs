
namespace BridgePattern
{
    public class IPhone : MobilePhone
    {
        public IPhone(MobilePhoneApp app)
            : base(app)
        { 
        
        }

        public override void Run()
        {
            this.app.Run();
        }
    }
}
