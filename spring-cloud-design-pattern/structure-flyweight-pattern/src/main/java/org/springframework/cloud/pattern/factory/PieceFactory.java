package org.springframework.cloud.pattern.factory;

import org.springframework.cloud.pattern.flyweight.BlackPiece;
import org.springframework.cloud.pattern.flyweight.Color;
import org.springframework.cloud.pattern.flyweight.Piece;
import org.springframework.cloud.pattern.flyweight.WhitePiece;

import java.util.HashMap;

/**
 * @author zhy
 * @date 2023/5/25 11:37
 */
public class PieceFactory {
    private HashMap<Integer, Piece> pieceHashMap = new HashMap<>();

    public Piece getPiece(Color color) {
        switch (color) {
            case WHITE:
                if (!pieceHashMap.containsKey(Color.WHITE.getCode())) {
                    pieceHashMap.put(Color.WHITE.getCode(), new WhitePiece());
                }
                break;
            case BLACK:
                if (!pieceHashMap.containsKey(Color.BLACK.getCode())) {
                    pieceHashMap.put(Color.BLACK.getCode(), new BlackPiece());
                }
                break;
            default:
                break;
        }
        return pieceHashMap.get(color.getCode());
    }
}
