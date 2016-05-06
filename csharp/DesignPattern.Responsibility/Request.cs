
namespace DesignPattern.Responsibility
{
    public class Request
    {
        private string name;
        /// <summary>
        /// 请假者的姓名
        /// </summary>
        public string Name
        {
            get { return name; }
            set { name = value; }
        }

        private double days;
        /// <summary>
        /// 请假天数
        /// </summary>
        public double Days
        {
            get { return days; }
            set { days = value; }
        }
    }
}
