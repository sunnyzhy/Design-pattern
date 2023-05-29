package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Master implements Observer {
    private STATE state;

    public Master() {
        this.state = STATE.SLEEP;
        System.out.println(this.state.name);
    }

    @Override
    public void update(String message) {
        this.state = STATE.WAKEUP;
        System.out.println(message + " ---> " + this.state.name);
    }

    enum STATE {
        SLEEP("主人在睡觉"),
        WAKEUP("主人起床");

        private String name;

        STATE(String name) {
            this.name = name;
        }
    }
}
