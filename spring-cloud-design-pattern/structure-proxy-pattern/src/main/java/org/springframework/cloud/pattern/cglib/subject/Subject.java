package org.springframework.cloud.pattern.cglib.subject;

/**
 * @author zhy
 * @date 2023/5/25 16:00
 */
public class Subject {
    public String request() {
        System.out.println("访问真实主题");
        return "subject";
    }
}
