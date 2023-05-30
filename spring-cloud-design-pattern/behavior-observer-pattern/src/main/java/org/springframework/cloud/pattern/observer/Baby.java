package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Baby implements Observer {
    private STATUS status;

    public Baby() {
        this.status = STATUS.SLEEP;
        System.out.println(this.status.name);
    }

    @Override
    public void update(String message) {
        this.status = STATUS.CRY;
        System.out.println(message + " ---> " + this.status.name);
    }

    enum STATUS {
        SLEEP("婴儿在睡觉"),
        CRY("婴儿哭");

        private String name;

        STATUS(String name) {
            this.name = name;
        }
    }
}
