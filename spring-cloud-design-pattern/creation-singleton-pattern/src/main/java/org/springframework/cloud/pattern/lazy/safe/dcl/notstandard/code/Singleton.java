package org.springframework.cloud.pattern.lazy.safe.dcl.notstandard.code;

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
     * @return
     */
    public static Singleton getSingleton() {
        // 先判断实例是否为空
        if (singleton == null) {
            // 抢到线程锁就实例化对象
            synchronized (Singleton.class) {
                // 再次判断实例是否为空
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
