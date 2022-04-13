package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.ChessPiece;
import ax.ha.tdd.chess.engine.pieces.Pawn;
import ax.ha.tdd.chess.engine.pieces.PieceType;

public class Game {

    Chessboard board = Chessboard.startingBoard();

    //Feel free to delete this stuff. Just for initial testing.
    boolean isNewGame = true;

    public Player getPlayerToMove() {
        //TODO this should reflect the current state.
        return Player.WHITE;
    }

    public Chessboard getBoard() {
        return board;
    }

    public String getLastMoveResult() {
        //TODO this should be used to show the player what happened
        //Illegal move, correct move, e2 moved to e4 etc.
        if (isNewGame) {
            return "Game hasn't begun";
        }
        return "Last move was successful (default reply, change this)";
    }

    public void move(String move) {
        //TODO this should trigger your move logic.
        isNewGame = false;
        System.out.println("Player tried to perform move: " + move);

        //! when playing the game it should be able to figure out based on what chess piece type it is how it should move.
        // and use the canMove() function of said class. but I have no idea how to make that work at the moment.

        Coordinates cords = new Coordinates(move);
        if(board.getPiece(cords).getPieceType() == PieceType.PAWN)
        {
            Pawn pawn = new Pawn(Player.WHITE,cords);
            if(pawn.canMove() == true)
            {

            }
        }
    }
}
