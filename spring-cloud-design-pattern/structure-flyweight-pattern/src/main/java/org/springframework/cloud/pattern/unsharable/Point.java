package org.springframework.cloud.pattern.unsharable;

import lombok.Data;

/**
 * @author zhy
 * @date 2023/5/25 11:30
 */
@Data
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
