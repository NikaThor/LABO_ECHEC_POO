package engine;

import chess.PieceType;
import chess.PlayerColor;

import java.awt.*;

public class Tour extends Piece {
    public Tour(PlayerColor couleur, PieceType pieceType, Point position, int pieceID) {
        super(couleur, pieceType, position, pieceID);
    }
}
