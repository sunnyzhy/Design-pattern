package org.springframework.cloud.pattern.lazy.safe.method.code;

/**
 * @author zhy
 * @date 2023/4/26 14:29
 */
public class Singleton {
    /**
     * 定义静态变量
     */
    private static Singleton singleton;

    /**
     * 私有化构造函数
     */
    private Singleton() {
    }

    /**
     * 提供公开访问该单例的全局方法
     *
     * 在方法上添加 synchronized 关键字，使方法成为受保护的资源。此时方法被串行化，影响性能
     * @return
     */
    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
