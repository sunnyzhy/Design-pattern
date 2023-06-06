package org.springframework.cloud.pattern.template;

/**
 * @author zhy
 * @date 2023/6/6 9:43
 */
public abstract class Compute {
    /**
     * 模板方法
     */
    public void duration() {
        long start = System.currentTimeMillis();
        calculate();
        long end = System.currentTimeMillis();
        System.out.println("任务执行的时间： " + (end - start) + "毫秒");
    }

    /**
     * 抽象方法
     */
    public abstract long calculate();
}
