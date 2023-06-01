package org.springframework.cloud.pattern.state;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/6/1 11:09
 */
public class New extends ThreadState {
    public New() {
        this.state = STATE.NEW;
        System.out.println(this.state.getName());
    }

    public void start(Context context) {
        System.out.print("调用 start 方法 --> ");
        context.setState(new Runnable());
    }
}
