package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.Rook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RookTest {

    @Test
    public void rook_first_step_test1_Y(){
        Assertions.assertTrue(new Rook(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 1)));
    }

    @Test
    public void rook_first_step_test2_Y(){
        Assertions.assertTrue(new Rook(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 5)));
    }

    @Test
    public void rook_first_2step_test1_Y(){
        Assertions.assertTrue(new Rook(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 2)));
    }

    @Test
    public void rook_first_2step_test2_Y(){
        Assertions.assertTrue(new Rook(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 4)));
    }

    @Test
    public void rook_first_step_test1_X(){
        Assertions.assertTrue(new Rook(Player.BLACK, new Coordinates(0, 1)).canMove(new Chessboard(), new Coordinates(1, 1)));
    }

    @Test
    public void rook_first_step_test2_X(){
        Assertions.assertTrue(new Rook(Player.WHITE, new Coordinates(6, 1)).canMove(new Chessboard(), new Coordinates(5, 1)));
    }

    @Test
    public void rook_first_2step_test1_X(){
        Assertions.assertTrue(new Rook(Player.BLACK, new Coordinates(0, 1)).canMove(new Chessboard(), new Coordinates(2, 1)));
    }

    @Test
    public void rook_first_2step_test2_X(){
        Assertions.assertTrue(new Rook(Player.WHITE, new Coordinates(6, 1)).canMove(new Chessboard(), new Coordinates(4, 1)));
    }

    @Test
    public void rook_Diagonal_FALSE(){
        Assertions.assertFalse(new Rook(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(3, 3)));
    }

    @Test
    public void rook_blocked_FALSE(){

        Chessboard chessboard = new Chessboard();

        chessboard.addPiece(new Rook(Player.WHITE,new Coordinates(4,4)));

        Assertions.assertFalse(new Rook(Player.BLACK, new Coordinates(4, 1)).canMove(chessboard, new Coordinates(4,6)));

    }

    @Test
    public void rook_eat_rook(){
        Chessboard chessboard = new Chessboard();

        chessboard.addPiece(new Rook(Player.WHITE,new Coordinates(4,4)));

        Assertions.assertTrue(new Rook(Player.BLACK,new Coordinates(4,1)).canMove(chessboard,new Coordinates(4,4)));


    }


}
