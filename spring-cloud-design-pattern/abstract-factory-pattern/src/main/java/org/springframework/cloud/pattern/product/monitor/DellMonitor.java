package org.springframework.cloud.pattern.product.monitor;

/**
 * @author zhy
 * @date 2022/3/3 9:36
 */
public class DellMonitor implements Monitor{
    @Override
    public void display() {
        System.out.println("戴尔显示器.");
    }
}
