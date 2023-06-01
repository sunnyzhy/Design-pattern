package org.springframework.cloud.pattern.state;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/6/1 11:09
 */
public class Running extends ThreadState {
    public Running() {
        this.state = STATE.RUNNING;
        System.out.println(this.state.getName());
    }

    public void suspend(Context context) {
        System.out.print("调用 suspend 方法 --> ");
        context.setState(new Blocked());
    }

    public void stop(Context context){
        System.out.print("调用 stop 方法 --> ");
        context.setState(new Terminated());
    }
}
