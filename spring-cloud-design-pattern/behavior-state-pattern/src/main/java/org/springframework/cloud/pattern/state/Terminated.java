package org.springframework.cloud.pattern.state;

/**
 * @author zhy
 * @date 2023/6/1 11:09
 */
public class Terminated extends ThreadState {
    public Terminated() {
        this.state = STATE.TERMINATED;
        System.out.println(this.state.getName());
    }
}
