package org.springframework.cloud.pattern.state;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/6/1 11:09
 */
public class Blocked extends ThreadState {
    public Blocked() {
        this.state = STATE.BLOCKED;
        System.out.println(this.state.getName());
    }

    public void resume(Context context) {
        System.out.print("调用 resume 方法 --> ");
        context.setState(new Runnable());
    }
}
