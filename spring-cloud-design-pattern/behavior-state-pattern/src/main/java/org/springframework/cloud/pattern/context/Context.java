package org.springframework.cloud.pattern.context;

import org.springframework.cloud.pattern.state.Blocked;
import org.springframework.cloud.pattern.state.New;
import org.springframework.cloud.pattern.state.Runnable;
import org.springframework.cloud.pattern.state.Running;
import org.springframework.cloud.pattern.state.ThreadState;

/**
 * @author zhy
 * @date 2023/6/1 10:45
 */
public class Context {
    private ThreadState state;

    public Context() {
        this.state = new New();
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public ThreadState getState() {
        return state;
    }

    public void start() {
        ((New) state).start(this);
    }

    public void getCPU() {
        ((Runnable) state).getCPU(this);
    }

    public void suspend() {
        ((Running) state).suspend(this);
    }

    public void resume() {
        ((Blocked) state).resume(this);
    }

    public void stop() {
        ((Running) state).stop(this);
    }
}
