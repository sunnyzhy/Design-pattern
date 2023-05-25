package org.springframework.cloud.pattern.statics.subject;

/**
 * @author zhy
 * @date 2023/5/25 16:00
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("访问真实主题");
    }
}
