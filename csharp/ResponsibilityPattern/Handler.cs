
namespace ResponsibilityPattern
{
    public abstract class Handler
    {
        private string name;
        /// <summary>
        /// 管理者的名字
        /// </summary>
        public string Name
        {
            get { return name; }
        }

        /// <summary>
        /// 管理者的上级
        /// </summary>
        protected Handler superior;

        public Handler(string name)
        {
            this.name = name;
        }

        public void SetSuperior(Handler superior)
        {
            this.superior = superior;
        }

        public abstract void HandeRequest(Request request);
    }
}
