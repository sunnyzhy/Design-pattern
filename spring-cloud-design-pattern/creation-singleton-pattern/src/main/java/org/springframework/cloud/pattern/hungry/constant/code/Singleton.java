package org.springframework.cloud.pattern.hungry.constant.code;

/**
 * @author zhy
 * @date 2023/4/26 14:29
 *
 * 在类加载的时候就完成了初始化
 */
public class Singleton {
    /**
     * 定义静态变量并实例化
     */
    private final static Singleton singleton = new Singleton();

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
