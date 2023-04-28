package org.springframework.cloud.pattern.hungry.block.code;

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
     * 在静态代码块里实例化
     */
    static {
        singleton = new Singleton();
    }

    /**
     * 私有化构造函数
     */
    private Singleton() {
    }

    /**
     * 提供公开访问该单例的全局方法
     * @return
     */
    public static Singleton getInstance() {
        return singleton;
    }
}
