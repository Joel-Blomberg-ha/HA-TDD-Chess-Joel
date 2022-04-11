package ax.ha.tdd.chess.engine;

import ax.ha.tdd.chess.engine.pieces.Knight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class KnightTest {

    @Test
    public void Knight_first_step_test1(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(2, 5)));
    }

    @Test
    public void Knight_first_step_test2(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(2, 3)));
    }

    @Test
    public void Knight_first_step_test3(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(3,6)));
    }

    @Test
    public void Knight_first_step_test4(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(3, 2)));
    }

    @Test
    public void Knight_first_step_test5(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(5, 6)));
    }

    @Test
    public void Knight_first_step_test6(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(5, 2)));
    }

    @Test
    public void Knight_first_step_test7(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(6, 5)));
    }

    @Test
    public void Knight_first_step_test8(){
        Assertions.assertTrue(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(6, 3)));
    }

    @Test
    public void Knight_wrong_step_1_FALSE(){
        Assertions.assertFalse(new Knight(Player.BLACK, new Coordinates(4, 4)).canMove(new Chessboard(), new Coordinates(5, 5)));
    }
}
