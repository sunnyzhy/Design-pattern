package org.springframework.cloud.pattern.cglib.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zhy
 * @date 2023/5/25 16:01
 */
public class Proxy implements MethodInterceptor {
    /***
     * 维护一个目标对象 target
     */
    private Object target;

    /**
     * 初始化目标对象
     *
     * @param target
     */
    public Proxy(Object target) {
        this.target = target;
    }

    /**
     * 动态生成一个代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        Object object = enhancer.create();
        return object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始");
        Object value = method.invoke(target, objects);
        System.out.println("Cglib代理结束");
        return value;
    }
}
