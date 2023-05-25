package org.springframework.cloud.pattern.flyweight;

import org.springframework.cloud.pattern.unsharable.Point;

/**
 * @author zhy
 * @date 2023/5/25 11:35
 */
public class BlackPiece implements Piece {
    @Override
    public void SetLocation(Point point) {
        System.out.println("黑棋坐标: x = " + point.getX() + ", y = " + point.getY());
    }
}
