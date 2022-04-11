package ax.ha.tdd.chess.engine.pieces;

import ax.ha.tdd.chess.engine.Chessboard;
import ax.ha.tdd.chess.engine.Coordinates;
import ax.ha.tdd.chess.engine.Player;

import static ax.ha.tdd.chess.engine.Player.BLACK;
import static ax.ha.tdd.chess.engine.Player.WHITE;
import static ax.ha.tdd.chess.engine.pieces.PieceType.PAWN;

public class Pawn extends ChessPiece{
    public Pawn(Player player, Coordinates location) {
        super(PAWN, player, location);
    }
    public int steps = 0;

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public boolean canMove(Chessboard chessboard, Coordinates destination) {

        if(chessboard.getPiece(destination) == null)
        {
            if (this.player == BLACK) {
                if (location.getY() < destination.getY() && location.getX() == destination.getX() && (destination.getY() - location.getY() <=1 || (destination.getY() - location.getY() <=2 && steps == 0))) {
                    this.steps = steps +1;
                    return true;
                }
            } else if (this.player == WHITE) {
                if (location.getY() > destination.getY() && location.getX() == destination.getX() && (location.getY() - destination.getY() <=1 || (location.getY() - destination.getY() <=2 && steps == 0))) {
                    this.steps = steps +1;
                    return true;
                }
            }
        }
        if(chessboard.getPiece(destination) != null && (destination.getX() > location.getX() || destination.getX() < location.getX()))
        {
            if (this.player == BLACK)
            {
                if(location.getY() < destination.getY() && (destination.getY() - location.getY() <=1 || (destination.getY() - location.getY() <=2 && steps == 0))) {
                    this.steps = steps + 1;
                    return true;
                }
            }
            else if (this.player == WHITE)
            {
                if(location.getY() > destination.getY() && (location.getY() - destination.getY() <=1 || (location.getY() - destination.getY() <=2 && steps == 0))) {
                    this.steps = steps + 1;
                    return true;
                }
            }
        }
        return false;
    }
}
