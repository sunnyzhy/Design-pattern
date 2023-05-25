package org.springframework.cloud.pattern.dynamics.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhy
 * @date 2023/5/25 16:01
 */
public class Proxy {
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
        Object object = java.lang.reflect.Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        // 反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("动态代理结束");
                        return returnVal;
                    }
                });
        return object;
    }
}
