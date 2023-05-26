package org.springframework.cloud.pattern.flyweight;

import org.springframework.cloud.pattern.unsharable.Point;

/**
 * @author zhy
 * @date 2023/5/25 11:31
 */
public interface Piece {
    void setLocation(Point point);
}
