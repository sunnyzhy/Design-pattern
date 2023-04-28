package org.springframework.cloud.pattern.enumeration.code;

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
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Single {
        INSTANCE;

        private final Singleton instance;

        Single() {
            instance = new Singleton();
        }

        private Singleton getInstance() {
            return instance;
        }
    }

    /**
     * 提供公开访问该单例的全局方法
     * @return
     */
    public static Singleton getInstance() {
        return Single.INSTANCE.getInstance();
    }
}
