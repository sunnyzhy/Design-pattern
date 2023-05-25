package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void testStatics() {
        org.springframework.cloud.pattern.statics.subject.Subject subject = new org.springframework.cloud.pattern.statics.subject.RealSubject();
        org.springframework.cloud.pattern.statics.proxy.Proxy proxy = new org.springframework.cloud.pattern.statics.proxy.Proxy(subject);
        proxy.request();
    }

    @Test
    void testDynamics() {
        org.springframework.cloud.pattern.dynamics.subject.Subject subject = new org.springframework.cloud.pattern.dynamics.subject.RealSubject();
        org.springframework.cloud.pattern.dynamics.proxy.Proxy proxy = new org.springframework.cloud.pattern.dynamics.proxy.Proxy(subject);
        Object object = proxy.getProxyInstance();
        org.springframework.cloud.pattern.dynamics.subject.Subject proxySubject = (org.springframework.cloud.pattern.dynamics.subject.Subject) object;
        proxySubject.request();
    }

    @Test
    void testCglib() {
        org.springframework.cloud.pattern.cglib.subject.Subject subject = new org.springframework.cloud.pattern.cglib.subject.Subject();
        org.springframework.cloud.pattern.cglib.proxy.Proxy proxy = new org.springframework.cloud.pattern.cglib.proxy.Proxy(subject);
        Object object = proxy.getProxyInstance();
        org.springframework.cloud.pattern.cglib.subject.Subject proxySubject = (org.springframework.cloud.pattern.cglib.subject.Subject) object;
        String value = proxySubject.request();
        System.out.println(value);
    }
}
