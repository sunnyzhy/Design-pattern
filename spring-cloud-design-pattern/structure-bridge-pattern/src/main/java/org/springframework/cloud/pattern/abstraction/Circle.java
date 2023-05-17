package org.springframework.cloud.pattern.abstraction;

/**
 * @author zhy
 * @date 2023/5/17 12:06
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.print("圆形");
        color.paint();
    }
}
