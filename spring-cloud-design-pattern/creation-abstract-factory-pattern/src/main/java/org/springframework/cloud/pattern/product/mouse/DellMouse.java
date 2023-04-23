package org.springframework.cloud.pattern.product.mouse;

/**
 * @author zhy
 * @date 2022/3/3 9:37
 */
public class DellMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("戴尔鼠标.");
    }
}
