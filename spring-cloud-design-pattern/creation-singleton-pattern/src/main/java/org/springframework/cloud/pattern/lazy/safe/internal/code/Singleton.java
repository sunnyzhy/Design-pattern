package org.springframework.cloud.pattern.lazy.safe.internal.code;

/**
 * @author zhy
 * @date 2023/4/26 14:29
 */
public class Singleton {
    /**
     * 私有化构造函数
     */
    private Singleton() {

    }

    /**
     * 单例持有者
     */
    private static class InstanceHolder {
        /**
         * 定义静态变量并实例化
         */
        private final static Singleton SINGLETON = new Singleton();
    }

    /**
     * 提供公开访问该单例的全局方法
     * @return
     */
    public static Singleton getInstance() {
        // 调用内部类属性
        return InstanceHolder.SINGLETON;
    }
}
