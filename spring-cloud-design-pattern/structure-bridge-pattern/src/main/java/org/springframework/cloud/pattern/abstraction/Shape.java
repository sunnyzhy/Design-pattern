package org.springframework.cloud.pattern.abstraction;

import org.springframework.cloud.pattern.implementor.Color;

/**
 * @author zhy
 * @date 2023/5/17 12:05
 */
public abstract class Shape {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
