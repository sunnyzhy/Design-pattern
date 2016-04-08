
namespace BridgePattern
{
    public abstract class MobilePhone
    {
        protected MobilePhoneApp app;

        public MobilePhone(MobilePhoneApp app)
        {
            this.app = app;
        }

        public abstract void Run();
    }
}
