package ax.ha.tdd.chess.engine.pieces;

import ax.ha.tdd.chess.engine.Chessboard;
import ax.ha.tdd.chess.engine.Coordinates;
import ax.ha.tdd.chess.engine.Player;

import static ax.ha.tdd.chess.engine.pieces.PieceType.KNIGHT;

public class Knight extends ChessPiece{
    public Knight(Player player, Coordinates location) {
        super(KNIGHT, player, location);
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public boolean canMove(Chessboard chessboard, Coordinates destination) {
        if(((destination.getX() == location.getX()+1) || (destination.getX() == location.getX()-1)) && ((destination.getY() == location.getY()+2) || (destination.getY() == location.getY()-2)))
        {
            return true;
        }
        if(((destination.getX() == location.getX()+2) || (destination.getX() == location.getX()-2)) && ((destination.getY() == location.getY()+1) || (destination.getY() == location.getY()-1)))
        {
            return true;
        }

        return false;
    }
}
