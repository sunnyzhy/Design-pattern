package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Master implements Observer {
    private String behavior;

    public Master(String behavior) {
        this.behavior = behavior;
    }

    @Override
    public void operation(String message) {
        System.out.println(message + " ---> " + this.behavior);
    }
}
