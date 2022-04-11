package ax.ha.tdd.chess.engine.pieces;

import ax.ha.tdd.chess.engine.Chessboard;
import ax.ha.tdd.chess.engine.Coordinates;
import ax.ha.tdd.chess.engine.Player;

import static ax.ha.tdd.chess.engine.pieces.PieceType.ROOK;

public class Rook extends ChessPiece{
    public Rook(Player player, Coordinates location) {
        super(ROOK, player, location);
    }

    @Override
    public String getSymbol() {
        return null;
    }

    @Override
    public boolean canMove(Chessboard chessboard, Coordinates destination) {

        Coordinates temp = new Coordinates(location.getX(), location.getY());
        if ((location.getY() == destination.getY() && location.getX() != destination.getX()) || (location.getY() != destination.getY() && location.getX() == destination.getX())){

            while(chessboard.getPiece(temp) == null)
            {
                if(chessboard.getPiece(temp) !=null)
                {
                    return false;
                }
                if(temp.getX() < destination.getX())
                {
                    temp = new Coordinates(temp.getX()+1,temp.getY());
                }
                if (temp.getX() > destination.getX())
                {
                    temp = new Coordinates(temp.getX()-1,temp.getY());
                }

                if(temp.getY() < destination.getY())
                {
                    temp = new Coordinates(temp.getX(),temp.getY()+1);
                }
                if (temp.getY() > destination.getY())
                {
                    temp = new Coordinates(temp.getX(),temp.getY()-1);
                }

                if(temp.getX() == destination.getX() && temp.getY() == destination.getY())
                {
                    return true;
                }
            }
        }
        return false;
    }
}
