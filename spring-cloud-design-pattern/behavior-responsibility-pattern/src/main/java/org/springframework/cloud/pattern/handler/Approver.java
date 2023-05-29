package org.springframework.cloud.pattern.handler;

/**
 * @author zhy
 * @date 2023/5/29 14:14
 */
public abstract class Approver {
    private Approver next;
    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNext(Approver next) {
        this.next = next;
    }

    public Approver getNext() {
        return next;
    }

    public abstract void process(int leaveDays);
}
