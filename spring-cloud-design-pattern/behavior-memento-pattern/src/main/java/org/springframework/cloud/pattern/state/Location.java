package org.springframework.cloud.pattern.state;

/**
 * @author zhy
 * @date 2023/5/31 11:47
 */
public class Location {
    private int x;
    private int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
