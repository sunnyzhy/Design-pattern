package org.springframework.cloud.pattern.flyweight;

import org.springframework.cloud.pattern.unsharable.Point;

/**
 * @author zhy
 * @date 2023/5/25 11:35
 */
public class WhitePiece implements Piece {
    @Override
    public void setLocation(Point point) {
        System.out.println("白棋坐标: x = " + point.getX() + ", y = " + point.getY());
    }
}
