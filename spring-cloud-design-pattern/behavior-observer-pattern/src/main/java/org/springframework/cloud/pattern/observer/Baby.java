package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Baby implements Observer {
    private STATE state;

    public Baby() {
        this.state = STATE.SLEEP;
        System.out.println(this.state.name);
    }

    @Override
    public void update(String message) {
        this.state = STATE.CRY;
        System.out.println(message + " ---> " + this.state.name);
    }

    enum STATE {
        SLEEP("婴儿在睡觉"),
        CRY("婴儿哭");

        private String name;

        STATE(String name) {
            this.name = name;
        }
    }
}
