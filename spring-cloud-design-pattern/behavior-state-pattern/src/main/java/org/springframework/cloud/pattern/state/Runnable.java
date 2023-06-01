package org.springframework.cloud.pattern.state;

import org.springframework.cloud.pattern.context.Context;

/**
 * @author zhy
 * @date 2023/6/1 11:09
 */
public class Runnable extends ThreadState {
    public Runnable() {
        this.state = STATE.RUNNABLE;
        System.out.println(this.state.getName());
    }

    public void getCPU(Context context) {
        System.out.print("调用 getCPU 方法 --> ");
        context.setState(new Running());
    }
}
