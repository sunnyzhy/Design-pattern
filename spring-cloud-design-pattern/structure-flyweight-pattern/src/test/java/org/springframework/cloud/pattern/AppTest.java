package org.springframework.cloud.pattern;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.pattern.factory.PieceFactory;
import org.springframework.cloud.pattern.flyweight.Color;
import org.springframework.cloud.pattern.flyweight.Piece;
import org.springframework.cloud.pattern.unsharable.Point;

/**
 * Unit test for simple App.
 */
@SpringBootTest
public class AppTest {
    @Test
    void test() {
        PieceFactory pieceFactory = new PieceFactory();
        Piece piece = pieceFactory.getPiece(Color.WHITE);
        piece.setLocation(new Point(1.1, 2.1));
        piece = pieceFactory.getPiece(Color.BLACK);
        piece.setLocation(new Point(10.1, 20.1));
        piece = pieceFactory.getPiece(Color.WHITE);
        piece.setLocation(new Point(2.1, 1.1));
        piece = pieceFactory.getPiece(Color.BLACK);
        piece.setLocation(new Point(9.1, 20.1));
    }
}
