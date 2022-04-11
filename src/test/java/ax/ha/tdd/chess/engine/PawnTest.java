package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.Pawn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class PawnTest {

    @Test
    public void pawn_first_step_test1(){
        Assertions.assertTrue(new Pawn(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 1)));
    }

    @Test
    public void pawn_first_step_test2(){
        Assertions.assertTrue(new Pawn(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 5)));
    }

    @Test
    public void pawn_first_2step_test1(){
        Assertions.assertTrue(new Pawn(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 2)));
    }

    @Test
    public void pawn_first_2step_test2(){
        Assertions.assertTrue(new Pawn(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 4)));
    }

    @Test
    public void pawn_step_to_farr1_FALSE(){
        Assertions.assertFalse(new Pawn(Player.BLACK, new Coordinates(1, 0)).canMove(new Chessboard(), new Coordinates(1, 3)));
    }

    @Test
    public void pawn_step_to_farr2_FALSE(){
        Assertions.assertFalse(new Pawn(Player.WHITE, new Coordinates(1, 6)).canMove(new Chessboard(), new Coordinates(1, 3)));
    }

    @Test
    public void pawn_first_wrong_step_backwards_test1_FALSE(){
        Assertions.assertFalse(new Pawn(Player.BLACK, new Coordinates(1, 1)).canMove(new Chessboard(), new Coordinates(1, 0)));
    }

    @Test
    public void pawn_first_wrong_step_backwards_test2_FALSE(){
        Assertions.assertFalse(new Pawn(Player.WHITE, new Coordinates(1, 5)).canMove(new Chessboard(), new Coordinates(1, 6)));
    }

    @Test
    public void pawn_eat_pawn()
    {
        Chessboard mock = mock(Chessboard.class);
        mock.addPiece(new Pawn(Player.WHITE,new Coordinates(4,4)));
        Assertions.assertTrue(new Pawn(Player.BLACK,new Coordinates(3,3)).canMove(mock,new Coordinates(4,4)));
    }



}
