package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Master implements Observer {
    private STATUS status;

    public Master() {
        this.status = STATUS.SLEEP;
        System.out.println(this.status.name);
    }

    @Override
    public void update(String message) {
        this.status = STATUS.WAKEUP;
        System.out.println(message + " ---> " + this.status.name);
    }

    enum STATUS {
        SLEEP("主人在睡觉"),
        WAKEUP("主人起床");

        private String name;

        STATUS(String name) {
            this.name = name;
        }
    }
}
