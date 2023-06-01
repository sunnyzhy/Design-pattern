package org.springframework.cloud.pattern.state;

/**
 * @author zhy
 * @date 2023/6/1 10:52
 */
public enum STATE {
    NEW("新建状态"),
    RUNNABLE("就绪状态"),
    RUNNING("运行状态"),
    BLOCKED("阻塞状态"),
    WAITING("等待状态"),
    TIMED_WAITING("计时等待状态"),
    TERMINATED("终止状态");

    private String name;

    STATE(String name) {
        this.name = name;
    }

    public String getName() {
        return "当前线程处于：" + name;
    }
}
