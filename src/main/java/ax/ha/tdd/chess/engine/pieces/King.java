package ax.ha.tdd.chess.engine.pieces;

import ax.ha.tdd.chess.engine.Chessboard;
import ax.ha.tdd.chess.engine.Coordinates;
import ax.ha.tdd.chess.engine.Player;

import static ax.ha.tdd.chess.engine.pieces.PieceType.KING;

public class King extends ChessPiece{
    public King(Player player, Coordinates location) {
        super(KING,player, location);
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public boolean canMove(Chessboard chessboard, Coordinates destination) {

        if((location.getX() - destination.getX() == 1 || destination.getX() - location.getX() == 1)||(location.getY() - destination.getY() == 1 || destination.getY() - location.getY() == 1))
        {
            return true;
        }
        return false;
    }
}
