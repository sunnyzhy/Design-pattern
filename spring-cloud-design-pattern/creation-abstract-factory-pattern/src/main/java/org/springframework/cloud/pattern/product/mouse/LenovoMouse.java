package org.springframework.cloud.pattern.product.mouse;

/**
 * @author zhy
 * @date 2022/3/3 9:37
 */
public class LenovoMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("联想鼠标.");
    }
}
