package org.springframework.cloud.pattern.observer;

/**
 * @author zhy
 * @date 2023/5/26 14:58
 */
public class Baby implements Observer {
    private String behavior;

    public Baby(String behavior) {
        this.behavior = behavior;
    }

    @Override
    public void operation(String message) {
        System.out.println(message + " ---> " + this.behavior);
    }
}
