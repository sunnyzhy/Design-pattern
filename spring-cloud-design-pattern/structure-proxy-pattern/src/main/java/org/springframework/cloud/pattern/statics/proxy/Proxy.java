package org.springframework.cloud.pattern.statics.proxy;

import org.springframework.cloud.pattern.statics.subject.Subject;

/**
 * @author zhy
 * @date 2023/5/25 16:01
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("访问真实主题之前的预处理");
    }

    private void postRequest() {
        System.out.println("访问真实主题之后的后续处理");
    }
}
