package org.springframework.cloud.pattern.handler;

/**
 * @author zhy
 * @date 2023/5/29 14:15
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void process(int leaveDays) {
        System.out.println("请假流程转给" + this.name + "。");
        if (leaveDays <= 20) {
            System.out.println(this.name + "批准" + leaveDays + "天假期。");
        } else {
            Approver next = getNext();
            if (next != null) {
                System.out.println(leaveDays + "天假期超出" + this.name + "的审批权限。");
                next.process(leaveDays);
            } else {
                System.out.println("请假的流程审批中断！");
            }
        }
    }
}
